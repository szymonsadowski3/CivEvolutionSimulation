package pl.edu.agh.kis.civsim.helpers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class DefaultCellContainerBuilderTest {
    @Test
    public void generateCells1Row() throws Exception {
        DefaultCellContainerBuilder defaultCellContainerBuilder = new DefaultCellContainerBuilder();
        ArrayList<SquareRepresentation> results = defaultCellContainerBuilder.generateCells(4, 2, 2);
        System.out.println(results);

        SquareRepresentation[] squares = new SquareRepresentation[]{new SquareRepresentation(0,0,2), new SquareRepresentation(2,0,2)};
        SquareRepresentation[] resultList = results.toArray(new SquareRepresentation[0]);
        assertArrayEquals(squares, resultList);
    }

    @Test
    public void generateCells2Rows() throws Exception {
        DefaultCellContainerBuilder defaultCellContainerBuilder = new DefaultCellContainerBuilder();
        ArrayList<SquareRepresentation> results = defaultCellContainerBuilder.generateCells(4, 4, 2);
        System.out.println(results);

        SquareRepresentation[] squaresArr = new SquareRepresentation[]{new SquareRepresentation(0,0,2), new SquareRepresentation(2,0,2)
                , new SquareRepresentation(0,2,2), new SquareRepresentation(2,2,2)};

        ArrayList<SquareRepresentation> squares = new ArrayList<>(Arrays.asList(squaresArr));

        assertTrue(squares.size() == results.size() &&
                squares.containsAll(results) && results.containsAll(squares));
    }
}
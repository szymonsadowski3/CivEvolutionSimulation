package java;

import org.junit.Test;
import pl.edu.agh.kis.civsim.helpers.DefaultCellContainerBuilder;

import static org.junit.Assert.*;

public class DefaultCellContainerBuilderTest {
    @Test
    public void generateCells2() throws Exception {
        DefaultCellContainerBuilder defaultCellContainerBuilder = new DefaultCellContainerBuilder();
        System.out.println(defaultCellContainerBuilder.generateCells(200, 100, 2));
        assertFalse(true);
    }

}
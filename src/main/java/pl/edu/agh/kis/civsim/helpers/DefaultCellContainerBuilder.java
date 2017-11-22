package pl.edu.agh.kis.civsim.helpers;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import pl.edu.agh.kis.civsim.world.Cell;
import pl.edu.agh.kis.civsim.world.Location;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DefaultCellContainerBuilder implements CellContainerBuilder {
    public ArrayList<SquareRepresentation> generateCells(int imgWidth, int imgHeight, int cellSize) {
        ArrayList<SquareRepresentation> results = new ArrayList<>();

        int howManyCellsAlongAxisX = imgWidth/cellSize;
        int howManyCellsAlongAxisY = imgHeight/cellSize;

        for (int x = 0; x < howManyCellsAlongAxisY; x++) {
            for (int y = 0; y < howManyCellsAlongAxisX; y++) {
                int sx1 = cellSize * y;
                int sy1 = cellSize * x;
                results.add(new SquareRepresentation(sx1, sy1, cellSize));
            }
        }

        return results;
    }

    @Override
    public Map<Location, int[]> buildCellsContainer(PImage mapImg) {
        Map<Location, int[]> result = new HashMap<Location, int[]>();
        int cellSize = CfgReader.getIntProperty("cellSizeInPixels");

        mapImg.loadPixels();

        ArrayList<SquareRepresentation> cells = generateCells(mapImg.width, mapImg.height, cellSize);

        for(SquareRepresentation cell: cells) {
            PImage imageChunk = mapImg.get(cell.getX(), cell.getY(), cell.getLength(), cell.getLength());
            result.put(new Location(cell.getX(), cell.getY()), imageChunk.pixels);
        }

        return result;
    }
}

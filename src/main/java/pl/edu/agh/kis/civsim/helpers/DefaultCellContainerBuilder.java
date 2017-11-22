package pl.edu.agh.kis.civsim.helpers;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import pl.edu.agh.kis.civsim.world.Cell;
import pl.edu.agh.kis.civsim.world.Location;
import processing.core.PImage;

import java.util.ArrayList;
import java.util.Map;

public class DefaultCellContainerBuilder implements CellContainerBuilder {
    class SquareRepresentation {
        private int x;
        private int y;
        private int length;

        public SquareRepresentation(int x, int y, int length) {
            this.x = x;
            this.y = y;
            this.length = length;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getLength() {
            return length;
        }
    }

    public ArrayList<SquareRepresentation> generateCells(int imgWidth, int imgHeight, int cellSize) {
        ArrayList<SquareRepresentation> results = new ArrayList<>();

        int howManyCellsAlongAxisX = imgWidth/cellSize;
        int howManyCellsAlongAxisY = imgHeight/cellSize;

        for (int x = 0; x < howManyCellsAlongAxisY; x++) {
            for (int y = 0; y < howManyCellsAlongAxisX; y++) {
                int sx1 = cellSize * y;
                int sy1 = cellSize * x;
//                int sx2 = cellSize * y + cellSize;
//                int sy2 = cellSize * y + cellSize;
                results.add(new SquareRepresentation(sx1, sy1, cellSize));
            }
        }

        return results;
    }

    @Override
    public Map<Location, Cell> buildCellsContainer(PImage mapImg) {
        int cellSize = CfgReader.getIntProperty("cellSizeInPixels");

        mapImg.loadPixels();
        mapImg.get();

        int[] mapPixels = mapImg.pixels;


        return null;
    }
}

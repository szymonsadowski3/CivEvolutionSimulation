package pl.edu.agh.kis.civsim.display;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import pl.edu.agh.kis.civsim.helpers.TerrainDeterminer;
import pl.edu.agh.kis.civsim.util.RGB;
import pl.edu.agh.kis.civsim.world.Cell;
import pl.edu.agh.kis.civsim.world.Location;
import pl.edu.agh.kis.civsim.world.Terrain;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

//name is subject to refactor
public class ViewManager {

    private static ArrayList<Cell> cellList;

    public static void buildTerrainList(Map<Location, int[]> locationToPixelMap) {

        //TODO: szybsze kolekcje, refactor. musi być jakiś lepszy sposób, liczę na Was
        ArrayList<Cell> result = new ArrayList<Cell>();
        ArrayList<Terrain> terrainList = new ArrayList<Terrain>();

        int cellSize = CfgReader.getIntProperty("cellSizeInPixels");

        for (Map.Entry<Location, int[]> entry : locationToPixelMap.entrySet()) {

            LinkedList<Location> locList = Location.getAllLocationsInTheCell(entry.getKey(), cellSize);

            for (int pixel : entry.getValue()) {
                RGB color = new RGB(pixel);

                Terrain tmpTerr = TerrainDeterminer.getTerrainType(color, locList.pop());

                terrainList.add(tmpTerr);
            }

            result.add(new Cell(terrainList));
        }

        cellList = result;
    }

    public static void dispCellBuild(Map<Location, int[]> build) {
        for (Map.Entry<Location, int[]> entry : build.entrySet()) {
            System.out.print(entry.getKey());

            for (int rgb : entry.getValue()) {
                System.out.print(new RGB(rgb).toString() + "| ");
            }


            System.out.println();
        }
    }

    public static ArrayList<Cell> getCellList() {

        //TODO well..............

        while (cellList == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return cellList;
    }
}

package pl.edu.agh.kis.civsim.world;

import pl.edu.agh.kis.civsim.civ.Tribe;
import pl.edu.agh.kis.civsim.display.ViewManager;

import java.util.ArrayList;

public class WorldMap {

    private ArrayList<Cell> cellGrid = ViewManager.getCellList();
    private Tribe[] runningTribes;




    public void update() {
        for(Tribe tr : runningTribes) {
            tr.migrate();
        }
        for(Cell cell : cellGrid){
            if(cell.isInhabited()){
                cell.develop();
            }
        }
    }

    public void testCellGrid() {
        for (Cell c : cellGrid) {
            System.out.println(c.getTerrainType());
        }
    }
}

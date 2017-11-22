package pl.edu.agh.kis.civsim.world;

import pl.edu.agh.kis.civsim.civ.Tribe;

public class WorldMap {

    Cell[] cellGrid;
    Tribe[] runningTribes;



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
}

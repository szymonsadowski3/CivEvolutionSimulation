package pl.edu.agh.kis.civsim.world;

import java.util.Collection;

public class Cell {

    private Terrain terrainType = null;

    private float terrainValue;

    private Collection<Terrain> locations;

    private boolean inhabited;

    public Cell(Collection<Terrain> locations) {
        this.locations = locations;
        determineTerrain();
        evaluate();
    }


    public boolean isInhabited() {
        return inhabited;
    }

    public void setInhabited(boolean inhabited) {
        this.inhabited = inhabited;
    }

    public Terrain getTerrainType() {

        return terrainType;
    }

    public void setTerrainType(Terrain terrainType) {

        this.terrainType = terrainType;
    }

    public float getTerrainValue() {
        return terrainValue;
    }


    public void develop(){
        for(Terrain tr : locations){
            if(tr instanceof Land){
                ((Land) tr).develop();
            }
        }
    }

    private void determineTerrain(){
        //TODO: brzydkie w ciul. może TerrainFactory?

        int landCount = 0;
        int waterCount = 0;

        for (Terrain terr : locations) {
            if (terr instanceof Land)
                landCount++;
            else
                waterCount++;
        }

        if (landCount > waterCount)
            this.terrainType = new Land();
        else
            this.terrainType = new Water();
    }

    private void evaluate(){
        //TODO: pobiera srednią z podterenów wg modelu ktorego jeszcze nie mamy :^)
    }
}

package pl.edu.agh.kis.civsim.world;

public class Cell {

    private Terrain terrainType = null;

    private float terrainValue;

    private Terrain[] locations;

    private boolean inhabited;

    //TODO: konstruktor


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
        //TODO: wywołanie jak tylko dostanie podtereny
    }

    private void evaluate(){
        //TODO: pobiera srednią z podterenów wg modelu ktorego jeszcze nie mamy :^)
    }
}

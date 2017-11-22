package pl.edu.agh.kis.civsim.world;

public class Land implements Terrain {

    private Location loc;
    private int fertility;
    private int development;

    public Land(Location loc) {
        this.loc = loc;
    }

    @Override
    public boolean terraform() {
        return false;
    }
}

package pl.edu.agh.kis.civsim.world;

public class Land implements Terrain {

    private int fertility;
    private int development;

    @Override
    public boolean terraform() {
        return false;
    }
}

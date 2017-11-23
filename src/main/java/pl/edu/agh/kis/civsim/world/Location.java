package pl.edu.agh.kis.civsim.world;

import java.util.LinkedList;

public class Location {

    private int xLoc;
    private int yLoc;

    public Location(int xLoc, int yLoc){
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    @Override
    public String toString() {
        return "Location{" +
                "xLoc=" + xLoc +
                ", yLoc=" + yLoc +
                '}';
    }

    public static LinkedList<Location> getAllLocationsInTheCell(Location cellLoc, int cellSize) {
        LinkedList<Location> locList = new LinkedList<Location>();

        int xLoc = cellLoc.getxLoc();
        int yLoc = cellLoc.getyLoc();

        for (int i = yLoc; i < yLoc + cellSize; i++)
            for (int j = xLoc; j < xLoc + cellSize; j++) {
                locList.add(new Location(i, j));
            }
        return locList;
    }
}

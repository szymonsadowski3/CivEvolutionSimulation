package pl.edu.agh.kis.civsim.helpers;

import pl.edu.agh.kis.civsim.util.RGB;
import pl.edu.agh.kis.civsim.world.Land;
import pl.edu.agh.kis.civsim.world.Location;
import pl.edu.agh.kis.civsim.world.Terrain;
import pl.edu.agh.kis.civsim.world.Water;

public class TerrainDeterminer {

    public static Terrain getTerrainType(RGB rgb, Location loc) {
        if (rgb.getBlue() > 200) {
            return new Water(loc);
        }

        return new Land(loc);

    }
}

package pl.edu.agh.kis.civsim.helpers;

import pl.edu.agh.kis.civsim.world.Cell;
import pl.edu.agh.kis.civsim.world.Location;
import processing.core.PImage;

import java.util.Map;

public interface CellContainerBuilder {
    Map<Location, Cell> buildCellsContainer(PImage mapImg);
}

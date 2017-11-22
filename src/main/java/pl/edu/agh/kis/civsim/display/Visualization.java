package pl.edu.agh.kis.civsim.display;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import pl.edu.agh.kis.civsim.helpers.DefaultCellContainerBuilder;
import pl.edu.agh.kis.civsim.util.RGB;
import pl.edu.agh.kis.civsim.world.Location;
import processing.core.PApplet;
import processing.core.PImage;

import java.util.Map;

public class Visualization extends PApplet {
    private int windowWidth;
    private int windowHeight;
    private PImage mapImg;
    private String mapImgPath;

    {
        this.windowHeight = CfgReader.getIntProperty("windowHeight");
        this.windowWidth = CfgReader.getIntProperty("windowWidth");
        this.mapImgPath = CfgReader.getStringProperty("mapImg");
    }

    public void visualize() {
        Visualization.main("pl.edu.agh.kis.civsim.display.Visualization");
    }

    public static void main(String[] args) {
        Visualization visualization = new Visualization();
        visualization.visualize();
    }

    @Override
    public void settings() {
        size(this.windowWidth, this.windowHeight);
    }

    @Override
    public void setup() {
        this.mapImg = loadImage(this.mapImgPath);
    }

    @Override
    public void draw(){
        image(this.mapImg, 0, 0);
//        DefaultCellContainerBuilder defaultCellContainerBuilder = new DefaultCellContainerBuilder();
//        Map<Location, int[]> result = defaultCellContainerBuilder.buildCellsContainer(this.mapImg);
//        dispCellBuild(result);
    }

    public PImage getMapImg() {
        return mapImg;
    }

    public void dispCellBuild(Map<Location, int[]> build) {
        for (Map.Entry<Location, int[]> entry: build.entrySet()) {
            System.out.println(convertToRgb(entry.getValue()[0]));
        }
    }

    public RGB convertToRgb(int rgbFullInt) {
        return new RGB(red(rgbFullInt), green(rgbFullInt), blue(rgbFullInt));
    }
}
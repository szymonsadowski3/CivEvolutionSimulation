package pl.edu.agh.kis.civsim.display;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import processing.core.PApplet;
import processing.core.PImage;

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
    }
}
package pl.edu.agh.kis.civsim.display;

import pl.edu.agh.kis.civsim.configreader.ConfigReaderSingleton;
import processing.core.PApplet;

/**
 * The purpose of this type is to
 */
public class Visualization extends PApplet {
    private int windowWidth;
    private int windowHeight;

    {
        ConfigReaderSingleton cfg = ConfigReaderSingleton.getInstance();
        this.windowHeight = cfg.getIntProperty("windowHeight");
        this.windowWidth = cfg.getIntProperty("windowWidth");
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
        fill(120,50,240);
    }

    @Override
    public void draw(){
        ellipse(width/2,height/2,second(),second());
    }
}
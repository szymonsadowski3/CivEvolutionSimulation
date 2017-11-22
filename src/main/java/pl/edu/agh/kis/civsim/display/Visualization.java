package pl.edu.agh.kis.civsim.display;

import pl.edu.agh.kis.civsim.configreader.ConfigReaderSingleton;
import processing.core.PApplet;

/**
 * The purpose of this type is to
 */
public class Visualization extends PApplet {
    private int windowWidth;
    private int windowHeight;

    public Visualization(int windowWidth, int windowHeight) {
        this.windowWidth = windowWidth;
        this.windowHeight = windowHeight;
    }

    public void visualize() {
        PApplet.main("pl.edu.agh.kis.civsim.display.Visualization");
    }

    public static void main(String[] args) {
        ConfigReaderSingleton cfg = ConfigReaderSingleton.getInstance();
        Visualization visualization = new Visualization(cfg.getIntProperty("windowWidth"),cfg.getIntProperty("windowHeight"));
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
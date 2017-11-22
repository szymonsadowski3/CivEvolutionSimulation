package pl.edu.agh.kis.civsim;

import pl.edu.agh.kis.civsim.display.Visualization;

public class Main {

    public static void main(String[] args){
        //TODO: wczytywanie pliku, może przesyłanie do WorldMap() w argumencie konstruktora żeby on sam sobie go wczytał? idk
        Visualization visualization = new Visualization();
        visualization.visualize();
    }
}

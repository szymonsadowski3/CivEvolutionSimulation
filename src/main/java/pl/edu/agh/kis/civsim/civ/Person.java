package pl.edu.agh.kis.civsim.civ;

import pl.edu.agh.kis.civsim.configreader.CfgReader;
import pl.edu.agh.kis.civsim.world.Cell;

public class Person {

    private final int deathAge = CfgReader.getIntProperty("deathAge");

    private Cell cell;

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age() {
        if(age > deathAge)
            die();
        else
            age++;
    }

    private void die(){
        //TODO: cokolwiek tu będzie, zobaczymy, pewnie usuniemy
    }

}

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

    public void move(){
        /*  TODO: po prostu przyklad tego jak to moze wygladac, jeszcze nie pewne.


            newCell = getMigrationValue();
            czy coś. funkcja ewaluacyjna zwraca cell który w sąsiedztwie wyciągnął największy value.
            wtedy probujemy się do niego przenieść.
            jeśli jest overpop, idziemy do drugiego najlepszego. (może funkcja ewaluacyjna będzie zwracać posortowaną tablicę
            lub jednokierunkową listę celli?
            jeśli drugim najlepszym jest teren na którym już jesteśmy, zostajemy, chyba że overpop, i tak dalej.
         */
    }

}

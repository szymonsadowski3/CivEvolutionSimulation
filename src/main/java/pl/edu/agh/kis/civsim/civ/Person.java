package pl.edu.agh.kis.civsim.civ;

public class Person {


    //tmp; bedzie wczytywany z configu
    private final int DEATH_AGE = 10;


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void age() {
        if(age > DEATH_AGE)
            die();
        else
            age++;
    }

    private void die(){
        //TODO: cokolwiek tu będzie, zobaczymy, pewnie usuniemy
    }

}

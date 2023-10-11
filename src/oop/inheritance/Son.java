package oop.inheritance;

public class Son extends Dad {

    public String sport;

    public Son(String name, int age, String hairColor, boolean mole, String sport) {
        super(name, age, hairColor, mole);
        this.sport = sport;
    }
}

// Parent class / Super class --> Dad
// Child class / Sub class --> Son

// instance variables / fields


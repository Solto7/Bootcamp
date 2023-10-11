package oop.interfaces;

public class Dancer extends Person{
    public Dancer(String name, int age) {
        super(name, age);
    }
    public String stretch(){
        return "stretching";
    }
}

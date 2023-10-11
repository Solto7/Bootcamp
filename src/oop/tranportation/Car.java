package oop.tranportation;

public class Car extends Transport implements Drive {
    public Car(String name, int model) {
        super(name, model);
    }

    @Override
    public boolean isWork() {
        return false;
    }


    @Override
    public String driving() {
        return name + " is driving";
    }
}

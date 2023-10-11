package oop.tranportation;

public class Ship extends Transport implements Sailing{

    public boolean isUnderWater;

    public Ship(String name, int model,boolean isUnderWater) {
        super(name, model);
        this.isUnderWater = isUnderWater;
    }

    @Override
    public boolean isWork() {
        if (isUnderWater == true) {
            return false;
        } else {
            return true;
        }

    }
    }

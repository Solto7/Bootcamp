package oop.tranportation;

public class Airplane extends Transport implements Drive,Fly{
    public Airplane(String name, int model) {
        super(name, model);
    }

    @Override
    public boolean isWork() {
        return false;
    }


    @Override
    public String driving() {
        return name + " of model: "+ model + " can drive too ";
    }

    @Override
    public String flying() {
        return Fly.super.flying();
    }
}

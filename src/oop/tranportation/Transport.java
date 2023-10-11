package oop.tranportation;

public abstract class Transport {

    public String name;
    public int model;


    public Transport(String name, int model) {
        this.name = name;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", model=" + model +
                '}';
    }

    public abstract boolean isWork ();
}

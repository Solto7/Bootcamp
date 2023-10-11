package oop.tranportation;

public interface Fly {

    double maxHigh = 8000.2;

    default String flying(){
        return "Airplane is flying";

    }
}

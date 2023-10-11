package oop.oop1;

public class Bellagio extends Giraffe{

    public String manager;
    public Bellagio(String name, String gender, int year) {
        super(name, gender, year);
    }

    public Bellagio(String name, String gender, int year, String manager) {
        super(name, gender, year);
        this.manager = manager;
    }
}

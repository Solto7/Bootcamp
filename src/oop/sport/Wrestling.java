package oop.sport;

public class Wrestling extends Sport implements Wrestle, Throwww {
    public double weight;

    public Wrestling(String name, int age, double weight) {
        super(name, age);
        this.weight = weight;
    }


    @Override
    public String Wreslingtrow() {
        return "Wreslingtrow";
    }

    @Override
    public String fight() {
        if (weight >= 80 && getAge() >= 18) {
            return "Can Fight";
        } else {
            return "Cant fighting";
        }

    }

    @Override
    public String streching() {
        return "Streching";
    }
}

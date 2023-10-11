package oop.abstruck_classes;

public class Cheif extends Person {

    public boolean hasMichelinStar;
    public Cheif(int id, String name, int age, double height,boolean hasMichelinStar) {
        super(id, name, age, height);
        this.hasMichelinStar = hasMichelinStar;
    }

    @Override
    public String toString() {
        return "Cheif{" +
                "hasMichelinStar=" + hasMichelinStar +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String action() {
        return "Cook manty";
    }

    @Override
    public String drink() {
        return "Juice";
    }
}

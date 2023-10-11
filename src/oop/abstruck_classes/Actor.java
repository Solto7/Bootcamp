package oop.abstruck_classes;

public class Actor extends Person {

    public boolean hasOscar;

    public Actor(int id, String name, int age, double height, boolean hasOscar) {
        super(id, name, age, height);
        this.hasOscar = hasOscar;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "hasOscar=" + hasOscar +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String action() {
        return "Play in movie";
    }

    @Override
    public String eat(boolean areYouVegetarian) {
        if (areYouVegetarian == true){
            return "can  eat meet";
        }
        else {
            return "can not eat meet";        }

    }

    @Override
    public String drink() {
        return "Drink soda";

    }
}

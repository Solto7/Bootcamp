package oop.abstruck_classes;

public abstract class Person extends Human {
    public int id;
    public String name;
    public int age;
    private double height;

    public Person(int id, String name, int age, double height) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public abstract String action();

    public  String eat(boolean answer){
        String result = " ";
        if (answer == true || answer == false){
            result = "Eating...";
        }
        return result;
    }
    public  String drink (){
        return "Drink the water";

    }


    }

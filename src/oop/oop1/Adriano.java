package oop.oop1;

public class Adriano extends Giraffe{

    public String waiters;
    public int age;
    public String color;
    public Adriano(String name, String gender, int year) {
        super(name, gender, year);
    }

    public Adriano(){
        super();

    }

    public Adriano(String name, String gender, int year, String waiters, int age, String color) {
        super(name, gender, year);
        this.waiters = waiters;
        this.age = age;
        this.color = color;
    }


    public String getWaiters(){
        System.out.println("Waiters can serve all the client");
        return waiters;
    }

    public static void setUp(){
        System.out.println("Hello world");

    }

    public int name (){
        int name1 = 12;
        return name1;
    }

    public static void main(String[] args) {
        setUp();
    }


}

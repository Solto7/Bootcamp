package oop;

public class DogMain {
    public static void main(String[] args) {

        int num = 89;

        Dog rex = new Dog();
        rex.name = "Rex";
        rex.age = 3;
        rex.color = "Brown";
        System.out.println(rex.name);
        System.out.println(rex.age);
        System.out.println(rex.color);
        rex.color = "White";
        System.out.println(rex.color);
        System.out.println(rex.breed);

        System.out.println("-------------------");

        Dog aktosh = new Dog();
        aktosh.name = "Aktosh";
        aktosh.age = 5;
        aktosh.color = "black";
        aktosh.breed = "kandek";

        System.out.println(aktosh.name);
        System.out.println(aktosh.breed);
        System.out.println(aktosh.eat());
        //                  "Aktosh"     " Is "       "eating"   " at the moment "
        System.out.println(aktosh.name + " Is " + aktosh.eat() + " at the moment ");

        System.out.println(aktosh.isSleep("YES"));

    }
}

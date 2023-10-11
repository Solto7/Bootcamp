package oop;

public class Practic2 {
    public static void main(String[] args) {

        Practice abc = new Practice();
        abc.age = 23;
        abc.name = "Jan";
        abc.weight = 154.3f;

        System.out.println(abc.age);
        System.out.println(abc.name);
        System.out.println(abc.weight);
        abc.age = 18;
        System.out.println(abc.age);
        System.out.println(abc.gym(31, abc.weight));
        System.out.println(abc.weight);

    }
}

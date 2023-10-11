package oop.abstruck_classes;

public class PersonMain {
    public static void main(String[] args) {
      Actor bred = new Actor(12345,"Bred Pitt",58,176,true);
        System.out.println(bred);
        System.out.println(   bred.action());
        System.out.println(bred.drink());


        Cheif nusret = new Cheif(1234,"Nusret",39,172,false);
        System.out.println(nusret);
        System.out.println(nusret.action());
        System.out.println(nusret.drink());
    }
}

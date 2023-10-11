package oop.inheritance;

public class FamilyMain {
    public static void main(String[] args) {


        Dad dad = new Dad("James", 53, "black", true);
        System.out.println(dad.talent());

        Dad son = new Dad("Will", 15, "black", false);
        System.out.println(dad.talent());

        Doch doch = new Doch("Aidana","black",19,false);
        System.out.println(doch.hairColored());

    }


}

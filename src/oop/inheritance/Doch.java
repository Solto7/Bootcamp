package oop.inheritance;


public class Doch extends Mother {

    private boolean hairColored;

    public Doch(String name, String hair, int age, boolean hairColored) {
        super(name, hair, age);
        this.hairColored = hairColored;
    }
//    public  checkHairColor () {
//
//        int age;
//        if (age < 18 & hairColored) {
//            System.out.println("Необходимо смыть краску с волос.");
//        } else if (age >= 18 & hairColored) {
//            System.out.println("Можно оставить покрашенные волосы.");
//        } else {
//            System.out.println("Волосы не покрашены.");
//        }

    public String hairColored() {
        if (getAge() >= 18 && hairColored) {
            return "Adina can coloring her hair";
        } else if (getAge()<18 && hairColored){
            return "Please washed it out";
        }else {
            return "your beautiful";
        }
    }
}

// практиковаться

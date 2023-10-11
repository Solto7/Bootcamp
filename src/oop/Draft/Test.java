package oop.Draft;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Person person1 = new Person("Barry");
        outPutInfo(animal1);
        outPutInfo(person1);
    }
    public static void outPutInfo(Info info){
        info.showInfo();
    }
}

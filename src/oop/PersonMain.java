package oop;

public class PersonMain {
    public static void main(String[] args) {

//        Person person = new Person();
//        person.id =123;
//        person.name = "Max";
//        person.age = 38;
//        person.profession = "doctor";
//        System.out.println(person.learn());

        Person alex = new Person(999,"Alex",35,"singer");
        System.out.println(alex.age);

        Person john = new Person(456,"John");
        System.out.println(john);
    }
}

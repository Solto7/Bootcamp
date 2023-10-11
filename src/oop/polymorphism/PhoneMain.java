package oop.polymorphism;

public class PhoneMain {
    public static void main(String[] args) {

        Phone phone = new Phone("Motorolla", "RZV",128,45000);
        System.out.println(phone.call());
        System.out.println(phone.call(true));

        Apple phone2 = new Apple("Apple","10X",256,57000);
        System.out.println(phone2.call()); // Tuuuut tuuuut
        System.out.println(phone2.call(true));// Your my heart, Your my soul

        int num = 90;
        num = 78;
    }

}

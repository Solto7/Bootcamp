package oop.oop1;

public class Phone1{

    public static void main(String[] args) {

        Phone<String> phone1 = new Phone<>();
        Phone<String> phone2 = new Phone<>("Apple");
        Phone<String> phone3 = new Phone<>("Samsung");
        Phone<Integer> phone4 = new Phone<>();
        Phone<Integer> phone5 = new Phone<>(2022);

        System.out.println("Phone1 properties initialized:" + phone1.isPropertiesInitialized());
        System.out.println("Phone2 properties initialized:" + phone2.isPropertiesInitialized());
        System.out.println("Phone3 properties initialized:" + phone3.isPropertiesInitialized());
        System.out.println("Phone4 properties initialized:" + phone4.isPropertiesInitialized());
        System.out.println("Phone5 properties initialized:" + phone5.isPropertiesInitialized());

        Adriano adriano = new Adriano();
        adriano.getWaiters();
        Adriano.setUp();
    }




}

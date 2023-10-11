package oop.phone;

public class PhoneMain {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("Nokia", "3310", "blue", 6000, -2);
        System.out.println(nokia.call(nokia.getBalance()));
        Iphone iphone = new Iphone("Iphone", "5", "Black", 65000, 100);
        System.out.println(iphone.call(iphone.getBalance()));
        System.out.println(iphone.usingInternet(iphone.getBalance()));
        System.out.println(iphone.keyboard());
    }
}

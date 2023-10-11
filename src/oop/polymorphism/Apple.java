package oop.polymorphism;

public class Apple extends Phone{

    public Apple(String brand, String model, double memory, double price) {
        super(brand, model, memory, price);

    }
    @Override
    public  String  call (boolean payment){
        if (payment== true){
            return "Your my heart, Your my soul";
        }
        else {
            return "tuut";

        }
    }

}

package oop.phone;

public class Nokia extends Phone {

    public Nokia(String mark, String model, String color, double price, int balance) {
        super(mark, model, color, price, balance);
    }

    @Override
    public String call(int balance) {
        if (balance > 0) {
            return "call";
        } else {
            return "You cannot call";
        }

    }
}

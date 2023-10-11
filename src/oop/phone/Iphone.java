package oop.phone;

public class Iphone extends Phone implements Internet {
    public Iphone(String mark, String model, String color, double price, int balance) {
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

    @Override
    public String usingInternet(int balance) {
        String result = "";
        if (balance > 120) {
            result = "You can use the internet";
        } else {
            result = "Top up the balance";
        }
        return result;
    }

    @Override
    public String keyboard() {
        return "EN QWERTY keyboard";
    }
}

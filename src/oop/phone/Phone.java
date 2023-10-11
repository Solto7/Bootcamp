package oop.phone;

public abstract class Phone {

    public String mark;
    protected String model;
    String color;
    private double price;
    private int balance;

    public Phone(String mark, String model, String color, double price, int balance) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.price = price;
        this.balance = balance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public abstract String call(int balance);
}

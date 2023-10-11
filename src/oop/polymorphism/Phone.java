package oop.polymorphism;

public class Phone {
    public String brand;
    public String model;
    protected double memory;
    private double price;

    public Phone(String brand, String model, double memory, double price) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String call(){
       return "Tuuuut tuuuut";
    }
    public String call(boolean payment){
        if (payment == true){
            return "Molmolum";
        }
        else {
            return call(); // "Tuuuut tuuuut"
        }
    }
    public String installing(){
        return "Loading...";
    }

    }


// Polymorphism

// Static Polymorphism / Overloading --Перегрузка методов-->Одинаковые методы разные параметры, создается в одном классе
// Dynamic Polymorphism / Overriding --Переопределение методов-->Одинаковые методы но разные Implementation calls edit in another classes
// Перегрузка (overload) и переопределение (override) – два инструмента достижения полиморфного поведения в Java.
// Перегрузкой реализуется ad-hoc-полиморфизм. Это значит «один и тот же» метод может работать с разными параметрами.
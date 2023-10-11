package oop.oop1;

public class Phone <T> {


    private T brand;
    private int year;
    private boolean isInitialized;

    public Phone(){
        isInitialized = false;
    }

    public Phone(T brand){
        this.brand = brand;
        this.isInitialized = true;
    }
    public Phone(T brand, int year){
        this.brand = brand;
        this.year = year;
        this.isInitialized = true;
    }

    public T getBrand(){
        return brand;
    }

    public void setBrand(T brand){
        this.brand = brand;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int year){
        this.year = year;
    }

    public boolean isPropertiesInitialized(){
        return isInitialized;
    }



}

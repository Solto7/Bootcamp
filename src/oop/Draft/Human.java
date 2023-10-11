package oop.Draft;

import java.util.Map;
public class Human {
    public String  name;
    public String surname;
    public int age;
    public int bucks;

    public Human(String name, String surname, int age, int bucks) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bucks = bucks;
    }

    public Human(String kolya) {

    }
    public String  buyBook(String author, Map<String, String> books){
        if (books.keySet().contains(author)){
            return books.get(author);
        }else return "No author";
    }

    public boolean sellBook(Book kolobok, Human aidin) {
        return false;
    }

}

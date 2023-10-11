package oop.Draft;

import java.util.*;

public class BookMain {
    public static void main(String[] args) {
        Book kolobok = new Book("Kolobok", 400, "El", 550);
        Book warAndPlace = new Book("War And Place", 1200, "Lev Tolstoy", 890);
        Book akKeme = new Book("Ak keme", 900, "Chyngyz Aitmatov", 600);
        Map<String , String > book = new LinkedHashMap<>();
        book.put(kolobok.author, kolobok.name);
        book.put(warAndPlace.author, warAndPlace.name);
        book.put(akKeme.author, akKeme.name);

        ArrayList<Integer> priseBooks = new ArrayList<>();
        priseBooks.add(kolobok.prise);
        priseBooks.add(warAndPlace.prise);
        priseBooks.add(akKeme.prise);

        Human aidin = new Human("Aidin", "Iskenderov", 17, 1500);
        System.out.println(aidin.buyBook("Lev Tolstoy", book));

        Human kolya = new Human("Kolya");

        System.out.println(kolya.sellBook(kolobok,aidin));
    }
}

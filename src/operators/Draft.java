package operators;

import java.net.Socket;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {

        String color = "Yellow";

        System.out.println(color);

        System.out.println("length of str: " + color.length()); // vyvodit kol chisla v cifr

        System.out.println("Char at: " + color.charAt(5)); // vyvodit na konsol bukvy cherez cifru

        color = color.concat(" sun"); // dobovlyaet text

     //   System.out.println("Concatenation: " + color.concat(" sun").length());
        System.out.println(color);

        String  laptop = "MacBookPro";
        System.out.println("MacBookPro; " + laptop.length());
        System.out.println(laptop.substring(3));
        System.out.println(laptop.substring(3,7));
        System.out.println(laptop.substring(7,10));

        String fruit = "          banana           ";
        System.out.println(fruit.trim()); //delete probel

        System.out.println(laptop.contains("o")); // contains  proveryat nalichie simvolov

        String word ="Baha";
        System.out.println("Result; " + word.startsWith("Aa"));




    }
}


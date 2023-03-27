package scanner1;

import java.util.Scanner;

public class Getinfo {
    public static void main(String[] args) {

        int number = 19;

        String str = "Hello";

        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name?");

        // String
        // next() -> fist word,
        // nextline() -> all sentence
        String name = scan.next();
        System.out.println("Your name is" + name);


    }
}

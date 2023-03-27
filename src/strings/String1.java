package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {

        //              012345
        String color = "Yellow";
        //              123456

        System.out.println(color);

        // length() dlina

        System.out.println("Length of str:" + color.length());

        // CharAt vozvrat

        System.out.println("Char at: " + color.charAt(4)); // 0

        //concat ()

        //       yellow      =     sun
        //  color = color.concat(" sun");
        System.out.println("Concatenation: " + color.concat(" sun"));
        // System.out.println(color);

        System.out.println("Air" + "pods");
        System.out.println("air".concat("pods"));
        System.out.println("air" + 3);
        //                         "4Bishkek58"
        System.out.println(3 + 1 + "Bis" + (9 + 7) + "hkek" + 5 + 8);

        // subString()

        //               0123456789
        String laptop = "MacBookPro";

        System.out.println(laptop.substring(3));
        System.out.println(laptop.substring(3, 7));
        System.out.println(laptop.substring(7, 10));
        // System.out.println(laptop.substring(7, 12)); za predely

        // trim() probely po bokam

        String fruit = "            banana      ";
        System.out.println(fruit.trim());

        // indexOf() libo simbol libo code

        System.out.println(fruit.indexOf(110)); // n

        int num = 110;
        int num2 = 'n'; // 110
        System.out.println(num);
        System.out.println(num2);

        // contains () endsWith(), equals()
        // 1. Scanner. Enter full name
        // 2. ov/ev -> 'm'
        // 3. ova/eva -> 'f'





    }
}

package strings;

import java.sql.SQLOutput;
import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        //                         11        21
//                      012345678901234567890123
        String phone = "Samsung - Samsung Galaxy";

        System.out.println(phone.indexOf('s')); // 0
        System.out.println(phone.indexOf('s')); // 3
        System.out.println(phone.indexOf("Galaxy")); //18
        System.out.println(phone.indexOf("Samsung"));  // 0
        System.out.println(phone.indexOf("Samsung")); // 0
        System.out.println(phone.indexOf("Samsung", 7));// 10
        System.out.println(phone.indexOf('a')); // 1
        System.out.println(phone.indexOf('a',9)); // 11
        System.out.println(phone.lastIndexOf('s'));//13
        System.out.println(phone.lastIndexOf("sung")); //13
        System.out.println(phone.lastIndexOf('a',17)); // 11
        System.out.println(phone.lastIndexOf('u', 9 )); // 4
        System.out.println(phone.lastIndexOf('g', 10)); // 6

        //.equals()
        String mark1 = "Bugatti";
        String mark2 = "Ferarri";
        boolean result1 = mark1.equals(mark2);
        boolean result2 = mark1 == mark2;
        System.out.println(result1);
        System.out.println(result2);

        String color1 = new String("White");
        String color2 = "White";

        System.out.println(color1 == color2);
        System.out.println(color1.equals(color2));

        String word1 = "Hi";
        String word2 = "hi";
        System.out.println(word1 == word2);
        System.out.println(word1.equals(word2)); // false
        System.out.println(word1.equalsIgnoreCase(word2)); // true

        String hero = "Iron mEn";
        System.out.println(hero.toLowerCase()); // vse nijnie

        System.out.println(hero.toUpperCase()); // vse verhie


        String actor = "Will Smith, Jaden Smith";
        System.out.println(actor.replace('m', 'M'));
        System.out.println(actor.replace("ill", "ek"));
        System.out.println(actor.replace("Smith","Pitt"));
        System.out.println(actor.replaceAll("Smith", "Jake"));


        // d/z Zamenit na consol 2i "Wuzzy" -> na slovo Smoothie


        String country = "   KyrGyz stAn  ";
       String result3 = country               // "    KyrGyz stAn   "
                .toUpperCase()                // " KYRGYZ STAN "
                .trim()                       //"KYRGYZSTAN"
                .replace(" ", " ")    //"STAN"
                .substring(6);

        System.out.println(result3);

        // contains()

        String greeting = "Hello, Aloha, Salam";
        System.out.println(greeting.contains("llo"));




    }
}

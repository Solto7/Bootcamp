package strings;

import java.util.Locale;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class StringExample {
    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7("BakaiBekaAidar");
        test8("bbaaaa is");
        test9();
        test10();

    }

    public static void test1() {
        String str1 = "Hello, World";
        System.out.println("напечатайте ее в консоль");
        System.out.println(str1);
    }

    public static void test2() {
        String str2 = "Hello ";
        String str3 = "World";
        System.out.println("объедините их в одну строку с помощью оператора * + *");
        System.out.println(str2 + str3);
    }

    public static void test3() {
        String str4 = "This is a test string";
        System.out.println("выведите в консоль первый символ, последний символ и длину строки");
        System.out.println(str4.charAt(0));
        System.out.println(str4.charAt(str4.length() - 1));
        System.out.println(str4.length());
    }

    public static void test4() {
        String str5 = "Java is fun";
        System.out.println("преобразуйте ее в строку из больших букв");
        System.out.println(str5.toUpperCase());
    }

    public static void test5() {
        String str6 = "This is a test string";
        System.out.println("замените все вхождения подстроки *test* на подстроку *sample*");
        System.out.println(str6.replace("test", "sample"));
    }

    public static void test6() {
        String str7 = "          Java is fun        ";
        System.out.println("удалите все пробелы в начале и конце строки ");
        System.out.println(str7.trim());
    }

    public static void test7(String slovo) {

        System.out.println("выведите в консоль все подстроки этой строки");

        int n = slovo.length();

        for (int i = 0; i < n; i++) {
            System.out.println(slovo.substring(0,n-i));

        }

    }

    public static void test8(String slovo2) {
        System.out.println("проверьте содержит ли эта строка подстроку *is* ");
        boolean have = slovo2.contains("is");
        System.out.println(have);
    }

    public static void test9() {
        String str10 = "Java is fun";
        System.out.println("найдите индекс первого вхождения подстроки *is*");
        int num = str10.indexOf("is");
        System.out.println(num);
    }

    public static void test10() {
        String str11 = "Java is fun";
        System.out.println("разделите эту строку на подстроки с разделителем пробел, и напечатайте каждую подстроку в отдельной строке");
        String[] substrings = str11.split(" ");
        for (String substring : substrings) {
            System.out.println(substring);
        }

    }
}


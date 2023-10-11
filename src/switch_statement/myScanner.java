package switch_statement;

import java.util.ArrayList;
import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("vvedite kakoe nibut Chislo");
//        int x  = s.nextInt();
//        System.out.println("vy vveli " + x);

//        int a = 10;
//        int b = 15;
//        int c = 8;
//
//        int max = a;
//
//        if (b > max) {
//            max = b;
//        }
//
//        if (c > max) {
//            max = c;
//        }
//
//        System.out.println("Наибольшее число: " + max);

//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(i * j + "\t");
//            }
//            System.out.println();
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        for (int number : numbers) {
            System.out.println(number);
        }

    }
    }

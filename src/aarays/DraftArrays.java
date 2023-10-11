package aarays;

import java.util.Arrays;
import java.util.Scanner;

public class DraftArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(mySurname()));


    }
    public static  char [][]  mySurname() {
        System.out.println("Enter full name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("asas");
        String surname = scanner.next();
        char name1[] = new char[name.length()];
        char surname1[] = new char[surname.length()];
        for (int i = 0; i < name.length(); i++) {
            name1[i] = name.charAt(i);
        }
        for (int i = 0; i < surname.length(); i++) {
            surname1[i] = surname.charAt(i);
        }
        char[][] fullname = {name1,surname1};
        return fullname;
    }
}



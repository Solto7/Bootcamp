package aarays;

import java.util.Arrays;

public class ArraysExample {
//  public static void main(String[] args) {
//        String name = "tilek";
//        char symbol[] = new char[name.length()];
//        for (char symbol1 : name.length() {
//            for (int i = 0; i < name.length(); i++) {
//                symbol[i] = symbol1;
//
//            }
//            System.out.println(symbol);
//
//        }
//
//    }
public static void main(String[] args) {
    String name = "Tilek";
    char[]syms = new char[name.length()];
    for (int i = 0; i < syms.length; i++){
        syms[i] = name.charAt(i);
    }
    System.out.println(Arrays.toString(syms));
}
}

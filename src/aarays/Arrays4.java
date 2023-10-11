package aarays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays4 {
    //    public static void main(String[] args) {
//
//        int[] nums = {23, 56, 78, 21};
//        System.out.println(Arrays.toString(nums));
//
//        String str = new String("Hello");
//        System.out.println(str.toString());
//
//        StringBuilder sb2 = new StringBuilder("Hello");
//        System.out.println(sb2.toString());
//
//        System.out.println(converting(new StringBuilder("Nomads")));
//
//        boolean b = true;
//        System.out.println(false);
//
//        if(20<13) System.out.println("hello");
//        if(true)
//            System.out.println("Salam");
//        else System.out.println("bye");
//
//        System.out.println(Arrays.toString(new int []{23,45,76}));
//    }
//
//    public static String converting(StringBuilder sb1) {
//        return sb1.toString();}
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter 3 type of colors");
        String color = scan.next();
        String color1 = scan.next();
        String color2 = scan.next();

        System.out.println(Arrays.toString(getColors(color,color1,color2)));
    }

    public static String [] getColors(String colors1, String colors2, String colors3){
        String color[] = new String[3];
        color[0]= colors1;
        color[1]= colors2;
        color[2]= colors3;
        return color;
    }

}

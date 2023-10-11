package oop.exception;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {

        System.out.println("hello World");


        try {
//            System.out.println(78/0);
            int[] nums = {3, 4,};
            System.out.println(nums[3]);
        } catch (Exception e) {

        }
        try {
            int x = 75;
            int y = 0;
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("This is ArithmeticException");
        }

//
//        try {
//            int [] hi = {34,67,11};
//            System.out.println(hi[90]);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception handled");
//        }

        int arrs[] = new int[3];

        try {
            arrs[0] = 78;
            arrs[1] = 34;
            arrs[2] = 76;
            arrs[3] = 89;

//            System.out.println(45 / 0);
            System.out.println(Arrays.toString(arrs));
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("This is finally block");
        }


        System.out.println("ArrayException");
    }
}

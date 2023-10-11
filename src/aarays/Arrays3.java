package aarays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
//        [black, White, green, "Purple"]

        //String colors[] = {"black", "White", "green", "Purple"};
        System.out.println(Arrays.toString(colors1()));
    }

    public static String[] colors1() {
        String colors[] = {"Black", "white", "green", "purple"};
        String str[] = new String[2];
        int j = 0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].toUpperCase().charAt(0) == colors[i].charAt(0)) {
                str[j] = colors[i];
                j++;
            }
        }
        return str;


    }
}

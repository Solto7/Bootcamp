package Draft;

import methods.Mark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {

        ArrayList<String> str = new ArrayList<>();
        str.add("Bakyt");
        str.add("Kiyal");
        str.add("Sheih");
        str.add("Bakai");
        str.add("Aidar");
        for (String s : str) {
            s = s + " Hi";
            System.out.println(s+ " ");
        }

    }



}


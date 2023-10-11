package oop.exception;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        int x;
        List<Integer> test_list = new ArrayList<>();
        test_list.add(1);

        x = 4 / 0;

        try {
            System.out.println(test_list.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(x);
    }
}

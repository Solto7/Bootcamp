package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> test_list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            test_list.add("Aidar");
        }

        count(test_list, "Aidar");
    }

    public static void count(List<String> list1, String word1) {
        int nums = 0;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).equals(word1)) {
                nums++;
            }

        }
        System.out.println(nums);

    }

}

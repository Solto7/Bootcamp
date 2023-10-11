package aarays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int num = 56;
        StringBuilder sb1 = new StringBuilder("Hello");

        int nums[] = new int[3];
        nums[0] = 23;
        nums[1] = 74;
        nums[2] = 90;
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        int nums2[] = new int[]{45, 23, 81, 12};
        System.out.println(Arrays.toString(nums2));

        int nums3[];
        nums3 = new int[2];
        nums3[0] = 77;
        nums3[1] = 90;
        System.out.println(Arrays.toString(nums3));

        String str = "Hello";
        System.out.println(str.toString());

        StringBuilder sb5 = new StringBuilder();
        System.out.println(sb5.toString());

        char[] symbols = new char[4];
        symbols[0] = 'R';
        symbols[1] = '%';
        symbols[2] = 'H';
        symbols[3] = 'T';
        System.out.println(symbols);
        System.out.println(Arrays.toString(symbols));

        double numbers[] = new double[2];
        numbers[0] = 45.23;
        numbers[1] = 21.2;
        System.out.println(Arrays.toString(numbers));

        int num5 []= new int[]{23,56,90};

        int nums6 [] =  {98,12,34,90};

    }
}

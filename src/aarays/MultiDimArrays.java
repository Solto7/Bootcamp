package aarays;

import java.util.Arrays;

public class MultiDimArrays {
    public static void main(String[] args) {

        int nums[] = {34, 67, 89};
        int nums2[][] = new int[2][3];

        nums2[0][0] = 23;
        nums2[0][1] = 67;
        nums2[0][2] = 5;

        nums2[1][0] = 98;
        nums2[1][1] = 12;
        nums2[1][2] = 9;

        System.out.println(nums2[1][1]);
        //                     0            1
        int nums3[][] = {{12, 76, 34}, {89, 54, 10}};

        System.out.println(nums3[0][1]);
        System.out.println(Arrays.deepToString(nums3));

        Arrays.sort(nums3[0]);
        System.out.println(Arrays.toString(nums3[0]));
        System.out.println(Arrays.deepToString(nums3));
        Arrays.sort(nums3[1]); // сортирует по нарастающей
        System.out.println(Arrays.deepToString(nums3)); //  для вывода второго массива
        //System.out.println(Arrays.binarySearch(nums3, 10)); // Относится только к одномерным массивам

        int nums4[][][] = new int[2][1][3];  // Трехмерный массив

        System.out.println(Arrays.deepToString(nums4));

        //                   1          2        3          4
        int nums5[][] = {{12, 34}, {7, 90, 54}, {5}, {77, 33, 28, 49}}; //Зубчатый Массив
        //              0 < 4
        for (int i = 0; i < nums5.length; i++) {
            //    0
            //             0 < 2
            for (int j = 0; j < nums5[i].length; j++) {
                //    12  34
                System.out.print(nums5[i][j] + " ");
            }
            System.out.println();
        }

        int arrs1[][] = {{33, 56, 76}, {91, 80, 34}};
        System.out.println(arrs1.length);
        System.out.println(arrs1[0].length);
        System.out.println(arrs1[1].length);

        for (int k = 0; k < arrs1.length; k++) {
            for (int n = 0; n < arrs1[k].length; n++) {
                System.out.println(arrs1[k][n] + " ");
            }
            System.out.println();

        }

    }
}

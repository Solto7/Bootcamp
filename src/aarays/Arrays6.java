package aarays;

import java.util.Arrays;

public class Arrays6 {
    public static void main(String[] args) {

        int arr[] = {90, 23, 65, 55, 0, 7, 43, 3, 99, 55, 76};        //Д.З вручную сортировку через цикл

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);   // Сортирует
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);

        System.out.println(Arrays.binarySearch(arr, 90)); // двоичный поиск Бинарный
        System.out.println(Arrays.binarySearch(arr, 7));
        System.out.println(Arrays.binarySearch(arr, 55));

        String students[] = {"Dastan", "Assanakulova", "Manas", "$yrgak", "1Kairat", "}Madina"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);     // сортирует строки по алфавиту
        System.out.println(Arrays.toString(students));

        char[] simb = new char[]{'i', 'b', '$'};
        if (simb[2] == '$') {
            char simb1 = simb[0];
            simb[0] = simb[2];
            simb[2]= simb1;
            System.out.println(Arrays.toString(simb));

        }


    }
}

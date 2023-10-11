package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {

        HashSet<Integer> set1 = new HashSet<>(); // НЕ работает с дубликатами random
        set1.add(8);
        set1.add(2);
        set1.add(4);
        set1.add(5);
        set1.add(9);
        set1.add(3);
        set1.add(1);
        System.out.println(set1);
        System.out.println();

        ArrayList<Integer> list1 = new ArrayList<>(); //Работает с дубликатами как написали
        list1.add(34);
        list1.add(77);
        list1.add(44);
        list1.add(33);
        System.out.println(list1);
        System.out.println();

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(); // Убирает Дубликаты Как было так и выводит
        set2.add(294);
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(294);
        set2.add(2);
        set2.add(294);
        System.out.println(set2);
        System.out.println();

        TreeSet<Integer> set3 = new TreeSet<>(); // Отсортировает игнорирует дубликаты по таблице
        set3.add(77);
        set3.add(67);
        set3.add(12);
        set3.add(9999);
        set3.add(999);
        set3.add(10000);
        set3.add(77);
        System.out.println(set3);


        System.out.println(set3.addAll(set1));
        System.out.println(set3);
        System.out.println(set3.size());

        ArrayList<Integer> bigNumbers = new ArrayList<>();

        for (Integer num : set3
        ) {
            if (num > 99) {
                bigNumbers.add(num);

            }
        }
        for (Integer num: bigNumbers) {
            set3.remove(num);
        }
        System.out.println("_________");
        for (Integer num : set3
        ) {
            System.out.println(num);
        }
        System.out.println("-----------");



        Set1 object = new Set1();

    }
    //                 non-static method
//        System.out.println(object.findMax(89, 100));
//
//    // static method
//    checkPhrase("James Bond");


    //                       67       23
    public int findMax(int num1, int num2) {
        //  89   > 100
        if (num1 > num2) {
            return num1;  // 67
        } else {
            return num2;
        }
    }

    public static void checkPhrase(String str) {
        if (str.contains(" ")) {
            System.out.println("This is a phrase");
        } else {
            System.out.println("This is a word");
        }
    }
}


package Draft;

import java.util.ArrayList;
import java.util.Arrays;

public class Draft5 {
    public static void main(String[] args) {
        int num1 = 67;
        Integer num2 = 89;

        String  str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1.hashCode()); // 69609650
        System.out.println(str2.hashCode()); // 69609650
        System.out.println(str1 == str2);    // false
        System.out.println(str1.equals(str2));

        String str3 = "Hello";
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder(str3); // "Hello"
        StringBuilder sb3 = new StringBuilder("Hi"); // --> String str = "Hi"

        System.out.println(sb1 == sb2);  // false
        System.out.println(sb1.equals(sb2)); // false
        System.out.println(sb1.toString().equals(sb2.toString())); // true


        // immutable
        String str4 = "James";
        String str5 = "James";
        String str6 = "James";
        System.out.println(str4 == str5); // true
        System.out.println(str4.equals(str6)); // true
        str6.toUpperCase();
        System.out.println(str6);

        System.out.println("______________");

        // mutable
        StringBuilder sb4 = new StringBuilder("Clark");
        StringBuilder sb5 = new StringBuilder("Clark");
        StringBuilder sb6 = new StringBuilder("Clark");
        System.out.println(sb4 == sb5); // false
        System.out.println(sb4.equals(sb6)); // false
        System.out.println(sb4.toString().equals(sb6.toString()));
        System.out.println(sb4.toString() == sb6.toString());
        sb6.append(" hi");
        System.out.println(sb6);

        // pool  -->   James
        // heap  -->   sb4 = Clark, sb5 = Clark, sb6 = "Clark hi"

        //                   Clark                      Clark


        // int -> Integer
        // String -> StringBuilder
        // Arrays[] -> ArrayList / LinkedList

        int[] nums1 = {34,56,91};
        System.out.println(nums1);  // [I@5cad8086
        System.out.println(Arrays.toString(nums1)); // [34, 56, 91]

        // ArrayList<Integer> --> Integer[]

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(67);
        list1.add(19);
        list1.add(88);
        System.out.println(list1);

        Integer[] arrsss = list1.toArray(new Integer[0]);

        Object[] objarr = list1.toArray();
        System.out.println(Arrays.toString(objarr));

        Integer[] intArr = list1.toArray(new Integer[list1.size()]);
        System.out.println(Arrays.toString(intArr));

        String digit = "123";
        Integer num = Integer.parseInt(digit);
        System.out.println(num);

        System.out.println();
        System.out.println();

        num = (Integer.parseInt(digit));



        // Scanner
        // String city = scan.next
        // String str = city........ "Bishkek";
        // Integer numbers = city......312;

        // "Hello4567" || "5678Hello"
        // Strng word = "fcgvhbj";
        // int digits = 4567;

        // "Hello12my78name09is89Asan"
        // String word = "HellomynameisAsan";
        // int = 12780989;

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        // 6001
        // 6002
        // 6003

        //                     new String[]       [colors.size()]
//        String[] listToArray = colors.toArray     (new String[colors.size()]);
//
//        String[] listToArray2 = colors.toArray(new String[0]);
//        System.out.println(Arrays.toString(listToArray2));


        // Этот вариант работает в зависимости от размера входного массива:
        // Если длина предварительно выделенного массива меньше размера коллекции,
        // выделяется новый массив необходимой длины и того же типа:
        String[] strs1 = colors.toArray(new String[0]); // 12:00 - 6000.   12:02 - 6003
        System.out.println(Arrays.toString(strs1));
    }
}

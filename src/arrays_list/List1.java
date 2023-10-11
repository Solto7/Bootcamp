package arrays_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class List1 {
    public static void main(String[] args) {
        ArrayList listOfColors = new ArrayList();
        listOfColors.add("White");
        listOfColors.add("Green");
        listOfColors.add("Pink");
        // {White, Green, Pink}

        listOfColors.add(1, "Yellow");
        // {White, Yellow, Green, Pink}

        listOfColors.remove(0);
        // {Yellow, Green, Pink}
        listOfColors.remove("Black");
        // {Yellow, Green, Pink}
        System.out.println(listOfColors);
        System.out.println(listOfColors.get(2));
        System.out.println("__________________");


        //       non-generic type
        ArrayList listOfSMTH = new ArrayList();
        listOfSMTH.add("Hello");  // String
        listOfSMTH.add("James");
        listOfSMTH.add(true);    // Boolean
        listOfSMTH.add(123);     // Integer
        listOfSMTH.add('D');     // Character
        listOfSMTH.add(34.5);
        System.out.println(listOfSMTH);

        for (Object i : listOfSMTH) {
            System.out.println(i);
        }
        System.out.println("__________________");

        //        generic type
        ArrayList<String> listOfStudents = new ArrayList<>();
        listOfStudents.add("Asan");
        listOfStudents.add("Chyngyz");
        listOfStudents.add("Alina");
        listOfStudents.add(2, "Zhibek");
        System.out.println(listOfStudents.add("Kamila"));
        System.out.println(listOfStudents);

        for (String str : listOfStudents) {
//            str = Zhibek
            System.out.println(str);
//            Asan
//            Chyngyz
//            Zhibek
        }


        System.out.println("_______________\n");

        ArrayList<Integer> listOfCVV = new ArrayList<>();
        listOfCVV.add(123);
        listOfCVV.add(456);
        listOfCVV.add(881);
        listOfCVV.add(920);

        ArrayList<Integer> cvv = new ArrayList<>();
        cvv.add(888);
        cvv.add(904);
        // {888, 904}
        cvv.addAll(1, listOfCVV);
        // 888, 123, 456, 881, 920, 904
        System.out.println(cvv);

        System.out.println(cvv.contains(881));

        System.out.println(cvv.size());
        // 888, 123, 456, 909, 920, 904
        cvv.set(3, 909);  // 00, 01, 02, 03, 04 ,05, 06 ,07, 08 09,10
        System.out.println(cvv);
        // 888, 909, 904
        cvv.removeAll(listOfCVV);
        System.out.println(cvv);

        // { 888, 904, 909

        cvv.clear();

        System.out.println(cvv);
        System.out.println(cvv.isEmpty());

        System.out.println(cvv.equals(listOfCVV));

        int nums1[] = new int[]{34, 56, 79};
        System.out.println(nums1.length);
//        Integer nums2[] = new Integer[]{23,78,12};
    }
}

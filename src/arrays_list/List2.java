package arrays_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class List2 {
    public static void main(String[] args) {

        int [] arrs = {34, 67, 98, 12};

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(34);
        list1.add(56);
        list1.add(91);
        list1.add(28);
        System.out.println(list1);  // [34, 56, 91, 28]
        list1.set(1, 100);
        list1.remove(3);
        list1.add(2, 88);
        System.out.println(list1);  // [34, 100, 88, 91]
        System.out.println(list1.contains(88));

        ArrayList<Integer> list = new ArrayList<>(list1);

        LinkedList<Double> list2 = new LinkedList<>();
        list2.add(178.34);
        list2.add(98.3);
        list2.add(675.18);
        list2.add(52.7);
        list2.add(327.9);
        list2.add(3, 77.7);
        list2.addFirst(66.6);
        list2.addLast(99.9);
        list2.add(34.98);
        System.out.println(list2);
        list2.remove(675.18);
        list2.removeFirst();
        list2.removeLast();
        System.out.println(list2);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(33);
        list3.add(88);
        list3.add(66);
        System.out.println(list3);
        list3.removeFirst();
        list3.add(1, 55);
        list3.addFirst(11);
        list3.remove(2);
        System.out.println(list3);  // [11, 88, 66]
        System.out.println(list3);
        System.out.println(list3.get(0)); // 33
        System.out.println("+++++++++++++");
        System.out.println(list3);

        for (int i = 0; i < list3.size(); i++){
            if (list3.contains(11)){
                list3.set(0, 44);
            }
            System.out.println(list3.get(i));

        }
        System.out.println("+++++++++++++");

        System.out.println("get method: "  + list3.get(1));

//        for (Integer i : list3){
//            System.out.println(i);
//        }

        int count = 0;
        //        1 < 3
        while(count < list3.size()){
            System.out.println(list3.get(count)); // 11 88 66
            count++; // 3
        }
        System.out.println("-_____________");

        int [] nums2 = {34, 56, 78,12};
        System.out.println(nums2[2]); // 78
        System.out.println(Arrays.toString(nums2));

        for (int i : nums2){
            // i = 12
            System.out.println(i); // 34, 56, 78, 12
        }


        String str = "Hello";
        System.out.println(str.contains("llo"));
        System.out.println(str.contains("jko"));
    }
}

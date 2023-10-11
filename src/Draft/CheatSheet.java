package Draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheatSheet {
    public static void main(String[] args) {

        // variables
        int num = 78;

// object
        String str = new String("Hello");
        str.toUpperCase();

// arrays
        char[] symbols = {'E', 'H', ':', '4'};

// List: ArrayList & LinkedList
        ArrayList<Boolean> list1 = new ArrayList<>();
        list1.add(true);
        list1.add(false);

// ......


// variable
        int num1 = 23;

// object
//        Integer num2 = new Integer(num1);


// arrays
//        int [] arrs = {num, num1, num2};

        String [] names = {"Aigerim", "Aygerim", "Aidin"};

// List
        ArrayList<String> listOfNames = new ArrayList<>(Arrays.asList(names));
        listOfNames.remove("Aidin");
        System.out.println(listOfNames);

        ArrayList<Character> symbols2 = new ArrayList<>();
        symbols2.add('1');
        symbols2.add('J');
        symbols2.add('x');


        List list = new ArrayList();
        list.addAll(listOfNames);
        list.addAll(symbols2);
        list.add(true);
        list.add(34.6f);
        System.out.println(list);

        List list2 = new ArrayList();
        list2.addAll(symbols2);



        String str3 = "Hi";
        StringBuilder sb2 = new StringBuilder(str3);






//....
    }
}

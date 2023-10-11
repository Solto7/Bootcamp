package arrays_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {

        ArrayList <Character> symbols = new ArrayList<>();
        symbols.add('r');
        symbols.add('k');
        symbols.add('@');
        symbols.add('?');
        System.out.println(symbols);
        Collections.sort(symbols);
        System.out.println(symbols);

        System.out.println("___________________");

        LinkedList<Character> symbols2 = new LinkedList<>();
        symbols2.add('o');
        symbols2.add('>');
        symbols2.add('$');
        symbols2.add('A');
        System.out.println(symbols2);
        Collections.sort(symbols2);
        System.out.println(symbols2);

// class       new constructor()
// ArrayList = new ArrayList()
// LinkedList = new LinkedList()

// List --> interface
// ArrayList  --> class
// LinkedList --> class

// interface = new constructor()
// List = new ArrayList()
// List = new LinkedList()

        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(23);
        numbers1.add(45);
        numbers1.add(67);
        numbers1.add(89);
        numbers1.set(1, 789);
        System.out.println(numbers1);

        List<Integer> numbers2 = new LinkedList<>();
        numbers2.add(90);
        numbers2.add(45);
        numbers2.add(17);
        numbers2.add(25);


        StringBuilder sb1 = new StringBuilder();


    }
}

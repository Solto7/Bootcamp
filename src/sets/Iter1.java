package sets;

import java.util.*;

public class Iter1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Yellow");
        System.out.println(colors);

        Iterator itr = colors.iterator();
        System.out.println(itr.hasNext());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.hasNext());


    }
}


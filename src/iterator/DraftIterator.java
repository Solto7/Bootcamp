package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DraftIterator {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNums = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            listOfNums.add(i);
        }
        System.out.println(listOfNums);

        String [] words = {"May", "June", "July"};
        ArrayList<String> month = new ArrayList<>();
        for (int i = 0; i <words.length; i++){
            month.add(words[i]); // words[2]
        }
        System.out.println(month);
        ArrayList<String> cities = new ArrayList<>();
        cities.add("USA");
        cities.add("UAE");
        cities.add("UK");
        cities.add("Bishkek");


        Iterator<String> itr = cities.iterator();
        while (itr.hasNext()){
            // true
            // true
            // true
            // true
            // false
            System.out.println(itr.next());
            // USA
            // UAE
            // UK
            // Bishkek
        }
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Green");
        colors.add("Pink");
        colors.add("Purple");
        colors.add("Black");
        colors.add("Yellow");
        System.out.println(colors);
        Iterator <String> it = colors.iterator();
        while(it.hasNext()) {
            String color = it.next();
            if (color.contains("Green")) {
                it.remove();


            }
        } System.out.println(colors);

    }
}

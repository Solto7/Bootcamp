package Draft;

import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;

public class DraftSet {
    public static void main(String[] args) {

        List<String> month = new LinkedList<>() ;
        month.add("Январь");
        month.add("Февраль");
        month.add("Апрель");
        month.add("Май");
        month.add("Июнь");
        month.add("Июль");
        month.add("Август");
        HashSet<String>month1 = new HashSet<>(month);
        month1.addAll(month);
        for (String name:month1) {
            for (int i = 0; i < month1.size(); i++) {

            }
            if(name.substring(name.length()-1).equals("ь")){
                month1.remove(name);
            }
            System.out.println(month1);
        }

    }
}

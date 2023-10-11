package map1;

import java.util.*;

public class Map1 {

    public static void main(String[] args) {

        Map<String, Character> fullName = new LinkedHashMap<>();
        fullName.put("Bermet", 'Z'); // Bermet = 'Z'
        fullName.put("Alisher", 'R');
        fullName.put("Allazor", 'K');

        Map<Integer, String> codeOfCities = new HashMap<>();
        codeOfCities.put(312, "Bishkek"); // 312 =Bishkek
        codeOfCities.put(555, "Megacom"); // 555 =Megacom
        codeOfCities.put(777, "Beeline"); // 777 =Beeline

        System.out.println(codeOfCities);

        Map<Float, String> vegetables = new LinkedHashMap<>();
        vegetables.put(300.40f, "Mango");
        vegetables.put(150.20f, "Garlic");
        vegetables.put(78.50f, "Cucumber");

        System.out.println(vegetables);

        Map<String, Integer> numbersOfCar = new TreeMap<>();
        numbersOfCar.put("Rolls Royce Phantom", 1);
        numbersOfCar.put("Honda Fit", 678);
        numbersOfCar.put("Toyota Sequoia", 345);
        numbersOfCar.put("Toyota Camry ", 7689);
        System.out.println(numbersOfCar);

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");   // 0 = Red
        colors.add("Green"); // 1= Green
        colors.add("Pink");  // 2 = Pink

        Map<String, String> phones = new LinkedHashMap<>();
        phones.put("Nokia", "6300");
        phones.put("Motorola", "Razr");
        phones.put("Blackberry", null);
        phones.put("telephone", "BlackBerry");
        phones.put("telephone", "BlackBerry222");
        phones.put("mobilePhone", "BlackBerry222");
        phones.put("Samsung", "s22");
//        phones.put("Iphone","5s");
        phones.put("Iphone", "6s");
        System.out.println(phones);

        System.out.println(phones.keySet());
        System.out.println(phones.values());
        System.out.println(phones.isEmpty());
        System.out.println(phones.size());
        System.out.println(phones.containsKey("Samsung"));
        System.out.println(phones.get("Motorola"));
        phones.remove("Iphone");
        phones.remove("Nokia", "6300");
        System.out.println(phones);
        phones.replace("mobilePhone","BlackBerry222", "Fonex");

        System.out.println(phones.get("Samsung").toLowerCase());

        Map<Integer,String> idCards = new TreeMap<>();
        idCards.put(1234,"Alina");
        idCards.put(3433,"Chingiz");
        idCards.put(12234,"Zhibek");
        System.out.println(idCards);

        for (Integer key : idCards.keySet()) {
            System.out.println(key);
        }

        }

    }


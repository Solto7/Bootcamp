package aarays;

public class Arrays5 {
    public static void main(String[] args) {

        String city = "London";
        System.out.println(city.length());

        System.out.println(city.length()-1);

        System.out.println(city.substring(city.length()-3));

        System.out.println(city.substring(2));
        System.out.println(city.substring(4));

        String cities [] = {"Bishkek","Barcelona", "london", "Washington DC"};
        System.out.println(cities.length);
        System.out.println(cities[2]);
        System.out.println(cities[cities.length-1]); // 4
        //System.out.println(cities[4]);

    }
}

package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        area(10, 5);
        bmi(76, 1.77);
        temperature(60);
        List<Integer> list2 = new ArrayList<>();
        list2.add(122);
        list2.add(344);
        list2.add(112);
        String test_string = "kdsyfsgkdjhfbhblwueyiquwibdnkvzxjcnvkehfa";
        average(list2);
        counter(test_string);
    }

    public static void area(int a, int b) {
        int area = a * b;
        int perimeter = a * 2 + b * 2;


        System.out.println("Площадь : " + area);
        System.out.println("Периметр : " + perimeter);

    }

    public static void bmi(int mass, double height) {
        double answer = mass / (height * height);
        System.out.printf("Индекс : %.0f", answer);
        System.out.println();

    }

    public static void temperature(double celsius) {
        double a = (celsius - 32) * 5 / 9;
        System.out.println("Фаренгейт : " + a);
    }

    public static void average(List<Integer> list1) {
        int sum = 0;
        for (int i = 0; i < list1.size(); i++) {
            sum = sum + list1.get(i);
        }
        int average = sum / list1.size();
        System.out.println(average);
    }

    public static void counter(String sentence) {
        int glass = 0;
        int sogl = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.toLowerCase().charAt(i) == 'a' || sentence.toLowerCase().charAt(i) == 'e' || sentence.toLowerCase().charAt(i) == 'y' || sentence.toLowerCase().charAt(i) == 'u'
                    || sentence.toLowerCase().charAt(i) == 'i') {
                glass++;
            } else {
                sogl++;
            }
        }

        System.out.println(glass);
        System.out.println(sogl);
    }

}


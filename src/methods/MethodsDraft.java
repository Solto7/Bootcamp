package methods;

import java.util.Scanner;

public class MethodsDraft {
    public static void main(String[] args) {
        MethodsDraft object = new MethodsDraft();
        System.out.println(object.fullWeekDays());
        Scanner scanner = new Scanner(System.in);
        String weekDay = scanner.next();
        System.out.println(object.fullWDays2(weekDay));
    }

    public String fullWeekDays() {
        Scanner scan = new Scanner(System.in);
        String shortWord = scan.next();

        switch (shortWord) {
            case "mon":
                shortWord = "Monday";
                break;
            case "tue":
                shortWord = "Tuesday";
        }
        return true + shortWord;
    }

    public String fullWDays2(String day) {
        switch (day) {
            case "wed":
                day = "Wendsday";
                break;
            case "thu":
                day = "Thursday";
        }
        return day;
    }

}

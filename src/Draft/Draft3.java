package Draft;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.awt.*;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Draft3 {
    public static void main(String[] args){
        Draft3 object = new Draft3();
        Scanner scanner = new Scanner(System.in);
        String weekDay = scanner.nextLine();
        System.out.println(object.day(weekDay));
    }
    public String day (String wDay){
        String res = "sa";
        switch (wDay){
            default: res = "Wrong word";
                break;
            case "mon":
                res = "Monday";
                break;
            case "tue":
                res = "Tuesday";
                break;
            case "wed":
                res = "Wednesday";
                break;
            case "thu":
                res = "Thursday";
                break;
            case "fri":
                res = "Friday";
                break;
            case "sat":
                res = "Saturday";
                break;
            case "sun":
                res = "Sunday";
                break;
        }return res;
    }
}

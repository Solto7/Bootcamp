package Draft;

import java.util.Scanner;

public class Draft2 {
    public static void main(String[] args) {
        System.out.println(ball1());
    }
    public static String ball1(){
        Scanner scan = new Scanner(System.in);
        int ball = scan.nextInt();
        String result;
        if (ball <= 100 && ball >= 80){
            result = "A";
        } else if (ball <= 79 && ball >= 60){
            result = "B";
        }else if (ball <= 59 && ball >= 40){
            result = "C";
        }else if(ball <= 40) {
            result = "D";
        }else {
            result = "Not have";

        }return result;

    }
}

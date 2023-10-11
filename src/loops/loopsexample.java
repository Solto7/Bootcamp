package loops;

import java.util.Scanner;

public class loopsexample {
    public static void main(String[] args) {
//        String word = "Nomads";
//        int num = word.length();
////        System.out.println(num);
//        while (num >= 1) {
//            if (num == 5) {
//               System.out.println(word.replace("d", "D"));
//            }
//            num--;
//        }
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
//        int n1 = word.length()-1;
        int n = word.length();
//        System.out.println(n);
//        System.out.println(n1);
//        System.out.println(word.length()-3);
//        System.out.println(word.length()-4);
//        System.out.println(word.charAt(3));
//        System.out.println(word.charAt(word.length()-4));
        while (n>=1){
            if (n == 8) {
                System.out.println(word.replaceFirst("s","I").replaceFirst("S","s")
                        .replaceFirst("I","s"));
                break;
            }
            n--;
        }
    }
}

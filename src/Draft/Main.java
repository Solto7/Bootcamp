package Draft;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ведите имя");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Веддите фамилию");
        String name2 = scan.nextLine();
        System.out.println("Ведите возраст");
        int nums2 = scan.nextInt();

        int num = 12;
        if (num <= 12) {
            System.out.println("вы подходите");
        } else
            System.out.println("Вы не подходите ");
    }
}
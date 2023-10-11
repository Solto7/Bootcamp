package Draft;

import java.util.Scanner;

public class Draft4 {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать на Fly Jump");
        System.out.println("Укажите ваш возраст");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age >= 18 && age <= 60) {
            System.out.println("Укажите ваш вес");
            int weight = scanner.nextInt();
            if (weight >= 60 && weight <= 100) {
                System.out.println("У вас есть психологические проблемы? ");
                System.err.println("1- положительный 2- Отрицательный");
                int num = scanner.nextInt();
                if (num == 2) {
                    System.out.println("Выберите функции");
                    System.out.println("1-Прыгнуть с канатки");
                    System.out.println("2-Прыгнуть с канатки с тренером");
                    System.out.println("3-Прыгнуть с канатки с камерой");
                    System.err.println(" (Укажите числом от 1 до 3)");
                    int sport = scanner.nextInt();
                    switch (sport) {
                        default:
                            System.err.println("не существует такого вида");
                            break;
                        case 1:
                            System.out.println("Прыгнуть с канатки");
                            System.out.println("Мы ждем вас в офисе");
                            break;
                        case 2:
                            System.out.println("Прыгнуть с канатки с тренером");
                            System.out.println("Мы ждем вас в офисе");
                            break;
                        case 3:
                            System.out.println("Прыгнуть с канатки с камерой");
                            System.out.println("Мы ждем вас в офисе");
                            break;
                    }
                } else {
                    System.out.println("мы не можем предоставить такой вид спорта");
                }
            } else {
                System.out.println("Ваш вес не подходит");
            }

        } else {
            System.out.println("Ваш возраст не подходит");
        }
    }
}

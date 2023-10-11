package loops;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class loops3 {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Укажите возраст");
                int age = scanner.nextInt();
                if (age >= 18 ) {
                    System.out.println("Каким экстремальным видом спорта вы хотите заняться?");
                    System.out.println("1-Прыгнуть с канатки");
                    System.out.println("2-Прыгнуть с канатки с тренером");
                    System.out.println("3-Прыгнуть с канатки с камерой");
                    System.err.println(" (Укажите числом от 1 до 3)");
                    int sport = scanner.nextInt();
                    switch (sport) {
                        default:
                            System.out.println("не существует такого вида");
                            break;
                        case 1:
                            System.out.println("Прыгнуть с канатки");
                            break;
                        case 2:
                            System.out.println("Прыгнуть с канатки с тренером");
                            break;
                        case 3:
                            System.out.println("Прыгнуть с канатки с камерой");
                            break;
                    }

                    System.out.println("Укажите Вес?");
                    int weight = scanner.nextInt();
                    if (weight >= 60 && weight <=100) {
                        System.out.println("Вес: " + weight);
                        System.out.println("Отлично!");
                        System.out.println("У вас есть психологические проблемы? ");
                        System.err.println("1- положительный 2- Отрицательный");
                        String typeOfTest = scanner.next();
                        switch(typeOfTest) {
                            default:
                                System.out.println("мы не можем предоставить такой вид спорта");
                                break;
                            case  "1":
                                System.out.println("мы не можем предоставить вам этот вид спорта");
                                break;
                            case "2":
                                System.out.println("Можете приехать к нам в офис для подписания договора");
                                break;
                        }
                    } else {
                        System.out.println("Ваш вес не подходит для данного спорта");
                    }
                } else {
                    System.out.println("Ваш возраст не подходит");}









            }
        }

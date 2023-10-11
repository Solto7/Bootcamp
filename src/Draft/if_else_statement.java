package Draft;

import java.util.Objects;
import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        if_else_statement object = new if_else_statement();
        System.out.println(object.str());
    }

    public String str() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите свой логин: ");
        String str1 = scan.next();
        String name = "Baha";
        String name2 = "Password";
        {

        }
        if (str1.equalsIgnoreCase(name.trim())) {
            System.out.println("Правильный логин: ");
            System.out.println("Введите пароль: ");
            String name3 = scan.nextLine();
        } else {
            System.out.println("Не правильный логин");{

                if (str1.equalsIgnoreCase(name2.trim()));
                else System.out.println("Не правильный пароль");
            }


        }
        return str1;
    }
}




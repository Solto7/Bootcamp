package oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        // Person obj = new Person()  ---> False

        Dancer obj = new Dancer("Clark",28);
        System.out.println(obj.jumping());
        System.out.println(obj.stretch());

        Person obj2 = new Dancer("Jlo",50);
        System.out.println(obj2.jumping());
//        System.out.println(obj2.stretch); ---> False

        TikTokDancer obj3 = new TikTokDancer("Kamilla",18);
        System.out.println(obj3.jumping());
        System.out.println(obj3.stretch());

        Dancer obj4 = new TikTokDancer("Chingiz",19);
        System.out.println(obj4.jumping());
        System.out.println(obj4.stretch());

        Person obj5 = new TikTokDancer("Aidin",17);
        System.out.println(obj5.jumping());

        Jump obj6 = new TikTokDancer("Jibek",18);
        System.out.println(obj6.jumping());



        List list = new ArrayList();
        list.add("Manas");



    }
}

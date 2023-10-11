package oop;

import java.security.PublicKey;

public class Person {

    public int id;
    public String name;
    public int age;
    public String profession;



    public Person(int id1, String name1,int age1,String profession1){
        id = id1;
        name = name1;
        age = age1;
        profession = profession1;

    }
    public Person(int id2, String name2){

        id = id2;
        name = name2;

    }




    public String learn (){
        return "learning Java";
    }
}

package homeWork;

public class Student {


    int id;
    String name;
    int geometry;
    int economy;
    int english;


    public static void main(String[] args) {



        Student object = new Student();
        Student object1 = new Student();
        Student object2 = new Student();

        object.id = 1;
        object.name = "Ivan";
        object.geometry = 10;
        object.economy = 20;
        object.english = 30;
        System.out.println(object.name + " Средний балл : " + (object.economy + object.english + object.geometry) / 3);

        object1.id = 2;
        object1.name = "Oleg";
        object1.geometry = 10;
        object1.economy = 20;
        object1.english = 30;
        System.out.println(object1.name + " Средний балл : " + (object1.geometry + object1.english + object.economy) / 3);

        object2.id = 3;
        object2.name = "Sergei";
        object2.geometry = 10;
        object2.economy = 20;
        object2.english = 30;

        studentTest("Serega",34,23,44);
    }

    public static void studentTest(String name, int c, int d, int e) {
        int avarage = (c + d + e) / 3;
        System.out.println(name + " Средний балл : " + avarage);
    }
}

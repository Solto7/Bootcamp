package methods;

public class Draft {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Baha",20);

        String s1 = "Sheih ";
        Person person2 = new Person();
        person2.setNameAndAge(s1,30);

        person1.speak();
        person2.speak();


//        int year1 = person1.calculateYearsToRetirement();
//        int year2 = person2.calculateYearsToRetirement();
//        System.out.println("Первому человеку до пенсии: " + year1 + " лет");
//        System.out.println("Первому человеку до пенсии: " + year2 + " лет");

    }

    static class Person {
        String name;
        int age;


        void setNameAndAge(String username, int userage){
            name = username;
            age = userage;

        }
        int calculateYearsToRetirement() {
            int years = 65 - age;
            String s = "hello";
            return years;
        }

        void speak() {
            for (int i = 0; i < 4; i++) {
                System.out.println("My name is " + name + ",me " + age + " ears old");
            }

        }

        void sayHello() {
            System.out.println("Hello!");
        }

    }
}

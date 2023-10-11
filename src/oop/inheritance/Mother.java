package oop.inheritance;

public class Mother {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // + doch --> esli docheri +18 true or false >=18 false
    public String name;
    public String hair;
    private  int age;

    public Mother(String name, String hair, int age) {
        this.name = name;
        this.hair = hair;
        this.age = age;
    }
}


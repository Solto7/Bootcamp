package oop.inheritance;

public class Dad {
    public String name ;
    public int age;
    protected String hairColor;
    private boolean mole;

    public Dad(String name, int age, String hairColor, boolean mole) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
        this.mole = mole;
    }

    public boolean isMole() {
        return mole;
    }

    public void setMole(boolean mole) {
        this.mole = mole;
    }
    public  String talent(){
        return "Singing";

    }
}

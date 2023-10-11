package oop.Draft;

public class DraftOOp2 extends DraftOOp{
    public DraftOOp2(String name, int age) {
        super(name, age);
    }

    public String jump(){
        return "jumping";
    }

    @Override
    public String dance1(String name) {
        return "Backchat";

    }

    @Override
    public String toString() {
        return "DraftOOp2{" +
                "name='" + name + '\'' +
                ", age ='"+ getAge() +
                '}';
    }
}

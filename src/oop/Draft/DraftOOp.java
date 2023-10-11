package oop.Draft;

public class DraftOOp {
    public String name;
    private int age;

    public DraftOOp(String name, int age) {
        this.name = name;
        this. age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  String dance1(String name1) {
        return name = "dances tiktok";
    }

    @Override
    public String toString() {
        return "DraftOOp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public  String dance2() {
        return name = "hip=hop tiktok";
    }

    public static void main(String[]args){
        DraftOOp obj = new DraftOOp("Chole", 27);
        System.out.println(obj.name);
        System.out.println(obj.dance1(obj.name));
        System.out.println(obj.dance2());

        DraftOOp2 obj2 = new DraftOOp2("Christy", 47);
        System.out.println(obj2.dance1(obj2.name));
        System.out.println(obj.name);
        System.out.println(obj2);
    }

    // Поли Морф (много форм) одно и тоже проявляется в других значениях
    //
}

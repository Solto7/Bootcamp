package oop.phone;

 class Parrent {
int method(){
    return 1;
}
    }
    class child extends Parrent{
        @Override
        int method() {
            return 2;
        }
    }
    public class ExampleOvveride {
        public static void main(String[] args) {
            Parrent parent = new Parrent();
            Parrent child = new child();

            System.out.println(parent.method());
            System.out.println(child.method());
        }
}



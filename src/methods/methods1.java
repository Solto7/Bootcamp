package methods;

public class methods1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.insert(5, "world");
        System.out.println(sb1);

        methods1 object = new methods1();
        System.out.println(object.sumOfNums(7,4));

    }

    public int sumOfNums(int num1, int num2){
        return num1 + num2;
    }


}


    // Java classes --> methods
    // user classes --> methods

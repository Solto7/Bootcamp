package oop.exception;

public class Example2 {

    public boolean isEvenNumber(int num1) throws ArithmeticException,NullPointerException{
        boolean result = false;
        if (num1 % 2 == 0){
            result =  true;
        } else {
            throw new ArithmeticException("This is Odd number");
        }
        return result;
    }
    public static void main(String[] args) {

        try {
            Example2 obj = new Example2();
            System.out.println(9);
        }catch (Exception e){

        }
        System.out.println("After trow");
    }
}

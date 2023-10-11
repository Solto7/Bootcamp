package wrapper;

public class Wrap1 {
    public static void main(String[] args) {

        // primitive  non-primitive
        //            Wrapper classes

        // byte     - Byte
        // short    - Short
        // int      - Integer
        // long     - Long
        // float    - Float
        // double   - Double
        // char     - Character
        // boolean  - Boolean

        int num = 34;
        System.out.println(num);

        Integer n = 67;

        Integer num1 = 90;
        System.out.println(num1);

        byte num2 = num1.byteValue();

        System.out.println(Integer.max(23,56));

        String numbers = num1.toString();

        Boolean b = true;
        System.out.println(Boolean.parseBoolean("hello"));

        // Autoboxing int -> Integer
        int u = 12;
        Integer k = u;
        int p1 = 12;
        Integer p2 = 12;
        System.out.println(p1==p2);

        // Unboxing
        Integer v = 3;
        int f = v;


    }
}

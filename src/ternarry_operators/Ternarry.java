package ternarry_operators;

public class Ternarry {
    public static void main(String[] args) {

        int age = 13;
//        if (age < 18){
//            System.out.println(345678);
//        }
//        else {
//            System.out.println("Adult");
//        }

        //                     ()  ?     true   :  false
        String result = (age < 18) ? "Teenager" : "Adult";
        System.out.println(result);

        System.out.println(34 * 23 /2);

        //      true         true : false
        int num = (67 < 89) ?   10 : 50;
        System.out.println(num);


        int num1 =89;
        int num2 = 567;
        int num3 = 3;
        String red = "Rose", yellow = "Sun";


        int n1 = 2,     n2 = 9,     n3 = -11;
        // nested ternary operator
        // to find the largest number
        //              false    ?
        //              2 >= 9   ?
        int largest = (n1 >= n2) ?

//                 true     ? 2  : -11      true      ? 9  : -11
//                2 >= -11  ? 2  : -11      9 >= -11  ? 9  : -11
                ((n1 >= n3) ? n1 : n3)  :  ((n2 >= n3) ? n2 : n3);
//               (  true  ) ? 2  : -11  :   (  true  ) ? 9  : -11
//               (       true        )  :  (         false      )
        System.out.println("Largest Number: " + largest);
    }

}

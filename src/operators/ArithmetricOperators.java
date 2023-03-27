package operators;

public class ArithmetricOperators {
    public static void main(String[] args) {

        int likes = 34679;
        int views = 78900;

        int plus = likes + views;
        System.out.println(plus);

        int minus = views - likes;
        System.out.println(minus);

        int result1 =56 * 36;
        System.out.println(result1);

        int result2 = 469/23;
        System.out.println(result2);
        int result3 = 469%23;
        System.out.println(result3);
        System.out.println(9 / 3); // 3
        System.out.println(9 % 3); // 0
        System.out.println(9 / 4); // 2
        System.out.println(9 % 4);
        System.out.println(38.2 / 7);
        System.out.println(38.2 % 7);

        // ++ increment
        // ++n prefix
        int n = 1;
        System.out.println(n); // 1
        System.out.println(++n); // 2
        System.out.println(++n); // 3
        System.out.println(n); // 3
        System.out.println(++n); // 4
        // n++ postfix
        System.out.println(n); // 4
        System.out.println(n++); // 4 [5]
        System.out.println(n); // 5
        System.out.println(n++); // 5 [6]
        System.out.println(n++); // 6 [7]
        System.out.println(n); // 6 [7]
        // -- decrement
        System.out.println(n--); // 7 [6]
        System.out.println(n); // 6
        System.out.println(--n); // 5
        System.out.println(++n); // 6
        System.out.println(n++); // 6 [7]
        System.out.println(n); // 7

    }
}

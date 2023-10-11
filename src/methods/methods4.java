package methods;

public class methods4 {
    public static void main(String[] args) {
        methods4 obj = new methods4();
        System.out.println(sum(23,45));

        obj.sum2(67,98);
    }
    public static int sum(int n1, int n2){
        int result = n1 + n2;
        return result;

    }
    public void sum2(int n1, int n2){
        int result = n1 + n2;
        System.out.println(result);
    }
}

package methods;

public class methods3 {
    public int celsiusToFahrenheit(int celsius){
        int formula = (celsius * 9 / 5)+ 32;
        return formula;
    }

    public static float somToDollar(int som){
        return som * 86.7f;

    }

    public static void main(String[] args) {
        methods3 obj = new methods3();
        System.out.println(obj.celsiusToFahrenheit(38));

        System.out.println(somToDollar(16000));
    }

}




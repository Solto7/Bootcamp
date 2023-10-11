package Draft;


public class DraftForEachLoop {
    public static void main(String[] args) {
        yearChecker(1900);
        yearChecker(2004);
        yearChecker(1997);
        yearChecker(2000);

    }

    public static void yearChecker(int year) {
        //return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        if (year % 400 == 0) {
            System.out.println("vysokosnyi");
        } else {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println("vysokkosnyi");
            } else {
                System.out.println("ne vysokosnyi");
            }
        }
    }
}




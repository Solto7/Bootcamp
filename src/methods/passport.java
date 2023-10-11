package methods;

public class passport {
    public static void main(String[] args) {
        passport obj = new passport();
        System.out.println(obj.getAPassport("KG", 35));
        System.out.println(obj.getAPassport("KG", 13));
        System.out.println(obj.getAPassport("RK", 56));
        System.out.println(obj.getAPassport("UK", 27));
    }

    public String getAPassport(String userResident, int userAge) {
        String result;
        String resident = "KG";
        int age = 16;

        if (userResident.equalsIgnoreCase(resident)) {
            if (userAge >= age) {
                result = "Get a passport";
            } else {
                result = ("Your age is under 16");
            }
        } else {
            result = ("You can't get the KG passport");
        }
        return result;
    }
}

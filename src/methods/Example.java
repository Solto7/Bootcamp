package methods;

public class Example {
    public static void main(String[] args) {

        Example obj = new Example();
        obj.getAPassport("Kg",35);
        System.out.println(obj.getAPassport("KG", 13));
    }

    public String getAPassport(String userResident, int userAge) {
        String result;
        String resident = "KG";
        int age = 16;
        if (userResident.equalsIgnoreCase(resident)) {
            if (userAge >= 16) {
                result = "Get a Passport";
            } else {
                result = "You age is under 16";
            }
        } else {
            result = "you can't get the KG passport";
        }
        return result;
    }
}


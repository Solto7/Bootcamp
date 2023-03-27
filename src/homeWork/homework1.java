package homeWork;

public class homework1 {
    public static void main(String[] args) {
        String string = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn’t very fuzzy, was he?";
        System.out.println(string
                .substring(23)
                .replaceFirst("Wuzzy","Smoothie"));
    }
}

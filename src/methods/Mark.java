package methods;

public class Mark {
    public static void main(String[] args) {
        changeWords();
    }

    public static void changeWords() {
        String phrase = "Digital Nomads";
        String result = phrase.substring(8)          //nomads
                .concat(phrase.substring(7, 8)                  // nomads + " "
                        .concat(phrase.substring(0, 7)));       // nomads + " " + Digital
        System.out.println(result);                            // nomads Digital
    }

    public static void seconVersion() {
        String phrase = "Digital Nomads";
        String word1 = phrase.substring(8);
        String space = phrase.substring(7, 8);
        String word2 = phrase.substring(0, 7);
        String result = word1.concat(space).concat(word2);
        System.out.println(result);
    }

    public int sum1() {
        return 2 + 2;
    }

    protected int sum2() {
        return 3 + 3;

    }

    int sum3() {
        return 4 + 4;

    }

    private int sum4() {
        return 5 + 5;

    }
}

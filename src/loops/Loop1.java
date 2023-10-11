package loops;

public class Loop1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println( "Nomads "+ i);
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) ;
        {

            System.out.println("_________________________");
        }
        String word = "Pause/Stop Recording";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '/') {
                System.out.println(word.replace('/', ' '));
            }
        }


    }

}


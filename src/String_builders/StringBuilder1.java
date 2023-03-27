package String_builders;

public class StringBuilder1 {
    public static void main(String[] args) {

        String str = "Hello";
        String str2 = new String("Salam");
        System.out.println(str2.equals("Helo"));


        StringBuilder sb1 = new StringBuilder("Aloha");
        System.out.println(sb1.equals("Hi"));

        String name1 = "John";


        String name2 = "John";


        String name3 = "John";


        String name4 = "Clark";


        String name5 = new String("Will");

        String name7 = new String("Will");


        StringBuilder name6 = new StringBuilder("Scot");
        StringBuilder name8 = new StringBuilder("Scot");
        StringBuilder name9 = new StringBuilder("Scot");

        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name5);
        System.out.println(name1.equals(name7));
        System.out.println(name1.equals(name9.toString()));
        System.out.println(name6 == name8);
        System.out.println(name6.toString().equals(name8.toString()));

        String laptop1 = "Mac";
        String laptop2 = "book Pro";
        System.out.println(laptop1.concat(laptop2));

        StringBuilder laptop3 = new StringBuilder("Mac");
        StringBuilder laptop4 = new StringBuilder("Book Pro");
        StringBuilder result2 = laptop3.append(laptop4);
        System.out.println(result2);

        System.out.println("____________________");

        System.out.println(laptop1);
        System.out.println(laptop3);

//1
        StringBuilder sb3 = new StringBuilder();
        sb3.append('A');
        sb3.append(".Osmonov");
        sb3.append(true);
        sb3.append(45);
        System.out.println(sb3);

        StringBuilder sd4 = new StringBuilder("Java");
        sd4.append("language");
        System.out.println(sd4);

        StringBuilder sd5 = new StringBuilder(6);
        sd5.append("Hello World");
        System.out.println(sd5);

        StringBuilder sd6 = new StringBuilder();   //16
        System.out.println(sd6.capacity());
        //          12345678912345
        sd6.append("Digital Nomads");
        sd6.append(" ");
        sd6.append('!');
        sd6.append(8);


        StringBuilder test1 = new StringBuilder();
        test1 = test1.append('a');
        System.out.println(test1);

        String word = "Fuzzy Wuzzy was a bear. Fuzzy Wuzzy had no hair. Fuzzy Wuzzy wasn't very fuzzy, was he?";
        String word2 = "Bakai" + word.substring(5, 49) + "Bakai" + word.substring(54);
        System.out.println(word2);



    }
}

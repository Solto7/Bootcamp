import oop.Draft.Book;
import oop.interfaces.Person;

import java.util.*;

public class Conclusion {
    public static void main(String[] args) {
        int num1 = 78;
        Integer num2 = 89;

        // String

        // StringBuilder
        // StringBuffer

        ArrayList<String> list = new ArrayList<>();
        list.add("Salam");
        list.add("Hola");
        list.add("Hello");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(67);
        list2.add(12);

        System.out.println(list2.get(0));

        int arrs[] = {23,45,12};

        Integer arrs2 [] = {23,45,43};


        list2.add(arrs[0]); // 23
        list2.add(arrs2[1]);
        list2.add(num1);
        list2.add(num2);
        list2.add(90);
        System.out.println(list2);
        System.out.println(list2.get(4));
        System.out.println(list2.get(2));

        Integer arrs3[] = {23,56,12};
  ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arrs3)); // Конвертация с арай на лист

        int n1 = 90;
        Integer n2 = n1;
        System.out.println(n1);

        LinkedList<String> list4 = new LinkedList<>();

        Set<String> set1 = new HashSet<>(); // В Сэт нет индекса  Random Удаляет Дубликаты
        set1.add("Clark");
        set1.add("Sam");
        set1.add("John");
        System.out.println(set1);

        // 0 1 2 3 4
        // 2 4 6 1 9

        // 0 1 2 3 4 5
        // 1 2 4 6 9 2

        Map<Integer, String> map1 = new LinkedHashMap<>(); // Не имеет индексов ключи фикс знач изменяемы
        map1.put(10,"Messi");
        map1.put(17,"Mbappe");
        map1.put(7,"Ronaldo");
        map1.put(99,"Maradonna");
        map1.put(8,"Pele");

        Book book = new Book("Jamillya",268,"Aitmatov",550);
        Book book2 = new Book("Kosmos",354,"E. Lengold",800);

        StringBuilder str = new StringBuilder("Hello");

        List<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book);
        listOfBooks.add(book2);
        System.out.println(listOfBooks);




    }
}

package oop.Draft;

public class Seller {
    public String  name;
    public Seller(String name) {
        this.name = name;
    }
    public String sellBook(Book book, Human human){
        //550         1500
        if (book.prise > human.bucks){
            return "Can't buy the book";
        } else {
            int res = human.bucks - book.prise;
            return "Вот ваша книга " + book.name + ", её стоимость - " + book.prise + " Сдача - " + res;
        }
    }
}

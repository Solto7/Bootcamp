package oop.Draft;

public class Book {
    public String name;
    private int pages;
    public String author;
    public int prise;

    public Book(String name, int pages, String author, int prise) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.prise = prise;
    }

    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
}

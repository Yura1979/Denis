package com.ytsyutsyak.library;

public class Book extends LibItem {
    private String author;
    private String publisher;

    public Book(String name, int year, String author, String publisher) {
        super(name, year);
        this.author = author;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + "',year='" + year +
                "',author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}

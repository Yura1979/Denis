package com.ytsyutsyak.library;

public class YearBook extends LibItem {

    private String publisher;
    private String tem;

    public YearBook(String name, int year, String publisher, String tem) {
        super(name, year);
        this.publisher = publisher;
        this.tem = tem;
    }

    @Override
    public String toString() {
        return "YearBook{" +
                "publisher='" + publisher + '\'' +
                ", tem='" + tem + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

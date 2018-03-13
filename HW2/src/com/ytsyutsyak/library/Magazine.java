package com.ytsyutsyak.library;

public class Magazine extends LibItem {

    private String tem;
    private int day;
    private int month;

    public Magazine(String name, int year, String tem, int day, int month) {
        super(name, year);
        this.tem = tem;
        this.day = day;
        this.month = month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "tem='" + tem + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}

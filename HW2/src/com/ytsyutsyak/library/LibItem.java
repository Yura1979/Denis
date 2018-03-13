package com.ytsyutsyak.library;

public abstract class LibItem {
    protected String name;
    protected int year;

    public LibItem(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public abstract String toString();
}

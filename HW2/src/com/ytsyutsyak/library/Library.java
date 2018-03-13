package com.ytsyutsyak.library;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibItem> library;

    public Library() {
        library = new ArrayList<>();
    }
    public void addItem(LibItem libItem){
        if (libItem != null){
            library.add(libItem);
        }
    }
    public void getLibItemByYear(int year){
        if (year > 0) {
            for (int i = 0; i < library.size(); i++) {
                if (library.get(i).year == year){
                    System.out.println(library.get(i));
                }
            }
        }

    }
}

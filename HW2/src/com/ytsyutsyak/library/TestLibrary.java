package com.ytsyutsyak.library;

public class TestLibrary {
    public static void main(String[] args) {
        Book testBook = new Book("Mars", 1987, "Konan", "Planeta");
        //System.out.println(testBook);
        Book testBook2 = new Book("Earth", 1987, "Erik Van", "World lit");
        YearBook yearBook = new YearBook("Yearbook1", 2002, "Planet", "Sciense");
        Magazine magazine = new Magazine("Menth Health", 2002, "Health", 10, 4);

        Library lib = new Library();

        lib.addItem(testBook);
        lib.addItem(testBook2);
        lib.addItem(yearBook);
        lib.addItem(magazine);

        lib.getLibItemByYear(2002);

    }
}

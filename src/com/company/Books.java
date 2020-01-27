package com.company;

import java.util.Scanner;

public class Books {

    Book theBook[] = new Book[50];
    private static int count;

    Scanner input = new Scanner(System.in);

    public int compareBookObject(Book b1, Book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

            System.out.println("The book of this name already exists");
            return 0;
        }
        return 0;
    }
}

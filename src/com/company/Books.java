package com.company;

import java.util.Scanner;

public class Books {

    Book theBooks[] = new Book[50];
    private static int count;

    Scanner input = new Scanner(System.in);

    public int compareBookObject(Book b1, Book b2) {
        if (b1.bookName.equalsIgnoreCase(b2.bookName)) {

            System.out.println("The book of this name already exists");
            return 0;
        }

        if (b1.sNo == b2.sNo) {

            System.out.println("Book of this Serial number already exists");
            return 0;
        }
        return 0;
    }

    public void addBook(Book b) {

        for (int i = 0; i < count; i++) {

            if (this.compareBookObject(b, this.theBooks[i]) == 0)
                return;
        }

        if (count < 50) {

            theBooks[count] = b;
            count++;
        } else {
            System.out.println("No more space to add books, sorry");
        }
    }


}

package com.company;

import java.util.Scanner;

public class Book {

    public int sNo;
    public String bookName;
    private String authorName;
    private int bookQty;
    private int bookQtyCopy;

    Scanner input = new Scanner(System.in);

    public Book() {

        System.out.println("Enter Serial Number of the book");
        this.sNo = input.nextInt();
        input.nextLine();
        System.out.println("Enter book name:");
        this.bookName = input.nextLine();
        System.out.println("Enter Author name:");
        this.authorName = input.nextLine();
        System.out.println("Enter Quantity of books:");
        this.bookQty = input.nextInt();
        bookQtyCopy = this.bookQty;
    }
}

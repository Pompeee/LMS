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

    public void searchBySno() {

        System.out.println("\t\t\t\tSearch by serial number\n");

        int sNo;
        System.out.println("Enter serial number of book");
        sNo = input.nextInt();

        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {

            if (sNo == theBooks[i].sNo) {

                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" + theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("No book for serial number " + sNo + " found.");
    }

    public void searchByAuthorName() {

        System.out.println("\t\t\t\tSEARCH BY AUTHOR'S NAME");
        input.nextLine();
        System.out.println("Enter Author Name:");
        String authorName = input.nextLine();
        int flag = 0;
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {

            if (authorName.equalsIgnoreCase(theBooks[i].authorName)) {

                System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" +
                        theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);
                flag++;
            }

        }
        if (flag == 0)
            System.out.println("No Books of " + authorName + " Found.");

    }

    public void showAllBooks() {

        System.out.println("\t\t\t\tSHOWING ALL BOOKS\n");
        System.out.println("S.No\t\tName\t\tAuthor\t\tAvailable Qty\t\tTotal Qty");
        for (int i = 0; i < count; i++) {

            System.out.println(theBooks[i].sNo + "\t\t" + theBooks[i].bookName + "\t\t" + theBooks[i].authorName + "\t\t" +
                    theBooks[i].bookQtyCopy + "\t\t" + theBooks[i].bookQty);


        }

    }

}

package com.company;

import java.util.Scanner;

public class Student {

    private String studentName;
    private String regNum;

    Book borrowedBooks[] = new Book[3];
    public int bookCount = 0;

    Scanner input = new Scanner(System.in);

    public Student() {
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();
    }
}

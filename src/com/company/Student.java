package com.company;

import java.util.Scanner;

public class Student {

    public String studentName;
    public String regNum;

    Book borrowedBooks[] = new Book[3];
    private int bookCount = 0;

    Scanner input = new Scanner(System.in);

    public Student() {
        System.out.println("Enter Student Name:");
        this.studentName = input.nextLine();

        System.out.println("Enter Reg Number");
        this.regNum = input.nextLine();
    }
}

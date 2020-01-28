package com.company;

import java.util.Scanner;

public class Students {

    Scanner input = new Scanner(System.in);

    Student theStudents[] = new Student[50];

    public static int count = 0;

    public void addStudent(Student s) {
        for (int i = 0; i < count; i++) {
            if (s.regNum.equalsIgnoreCase(theStudents[i].regNum)) {
                System.out.println("Student of reg number" + s.regNum + " is already registered");
                return;
            }
        }

        if (count <= 50) {
            theStudents[count] = s;
            count++;
        }
    }

    public void showAllStudents() {
        System.out.println("Student name \t\treg number");
        for (int i = 0; i < count; i++) {
            System.out.println(theStudents[i].studentName + "\t\t" + theStudents[i].regNum);
        }
    }

    public int isStudent() {

    }

}

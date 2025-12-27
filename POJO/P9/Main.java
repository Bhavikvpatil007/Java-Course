package POJO.P9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Student ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        String name = sc.nextLine();

        
        System.out.println("Choose Course Type:");
        System.out.println("1. Degree Course");
        System.out.println("2. Diploma Course");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Course Name:");
        String courseName = sc.nextLine();

        System.out.println("Enter Duration (months):");
        int duration = sc.nextInt();

        Course course; 

        if (choice == 1) {
            course = new DegreeCourse(courseName, duration);
        } else {
            course = new DiplomaCourse(courseName, duration);
        }

        Student student = new Student(id, name, course);
        student.displayDetails();

        sc.close();
    }
}

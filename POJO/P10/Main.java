package POJO.P10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Patient ID:");
        int pId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Patient Name:");
        String pName = sc.nextLine();

        System.out.println("Enter Patient Age:");
        int age = sc.nextInt();
        sc.nextLine();

        Patient patient = new Patient(pId, pName, age);

        System.out.println("\nEnter Doctor ID:");
        int dId = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Doctor Name:");
        String dName = sc.nextLine();

        System.out.println("Enter Doctor Specialization:");
        String specialization = sc.nextLine();

        Doctor doctor = new Doctor(dId, dName, specialization);

        
        System.out.println("\nEnter Room Number:");
        int roomNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Room Type:");
        String roomType = sc.nextLine();

        Room room = new Room(roomNo, roomType);

        Hospital hospital = new Hospital(patient, doctor, room);
        hospital.printReport();

        sc.close();
    }
}

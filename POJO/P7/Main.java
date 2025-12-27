package POJO.P7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Employee ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name:");
        String name = sc.nextLine();

      
        System.out.print("Enter City:");
        String city = sc.nextLine();

        System.out.print("Enter State:");
        String state = sc.nextLine();

       
        Address address = new Address(city, state);


        Employee emp = new Employee(id, name, address);

      
        System.out.println("--- Employee Details ---");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("City: " + emp.getAddress().getCity());
        System.out.println("State: " + emp.getAddress().getState());

        sc.close();
    }
}

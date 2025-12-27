package POJO.P1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.print("Enter Student ID : ");
		int id = sc.nextInt();
		sc.nextLine();
		s.setId(id);
		
		System.out.print("Enter Student Name : ");
		String name = sc.nextLine();
		s.setName(name);
		
		System.out.print("Enter Student % : ");
		double percentage = sc.nextDouble();
		s.setPercentage(percentage);
		
		System.out.println(s);
		
		sc.close();
	}
}

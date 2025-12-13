package Scanner;

import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter marks of English : ");
        int english = sc.nextInt();

        System.out.print("Enter marks of Marathi : ");
        int marathi = sc.nextInt();

        System.out.print("Enter marks of Hindi : ");
        int hindi = sc.nextInt();

        System.out.print("Enter marks of Science : ");
        int science = sc.nextInt();

        System.out.print("Enter marks of Maths: ");
        int maths = sc.nextInt();
        
        int total = english + marathi + hindi + science + maths;
        
        double percentage = (total/500.0)*100;
        
        System.out.println("Total Marks : "+total);
        System.out.println("Percentage : " + percentage + " %");
        
        sc.close();
	}

}

package POJO.P3;
import java.util.Scanner;

public class CalculatorApp {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("Result : " + calc.add(a, b));

        System.out.print("Enter a : ");
        int x = sc.nextInt();
        System.out.print("Enter b : ");
        int y = sc.nextInt();
        System.out.print("Enter c : ");
        int z = sc.nextInt();
        System.out.println("Result : " + calc.add(x, y, z));

        System.out.print("Enter a in decimal :");
        double d1 = sc.nextDouble();
        System.out.print("Enter b in decimal :");
        double d2 = sc.nextDouble();
        System.out.println("Result : " + calc.add(d1, d2));

        sc.close();
    }
}

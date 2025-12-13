package Scanner;

import java.util.Scanner;

public class SecondConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        int totalSeconds = sc.nextInt();

        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.println(minutes + " Minutes and "+ seconds+ " Seconds");

        sc.close();
    }
}

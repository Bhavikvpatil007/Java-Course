import java.util.Scanner;

public class ArrayPrimeNotPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Prime Numbers:");

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			boolean prime = true;

			if (num <= 1) {
				prime = false;
			} else {

				for (int j = 2; j < num; j++) {
					if (num % j == 0) {
						prime = false;
						break;
					}
				}

			}

			if (prime) {
				System.out.print(num + " ");
			}

		}

		System.out.println();

		System.out.println("Non Prime Numbers:");

		for (int i = 0; i < arr.length; i++) {

			int num = arr[i];
			boolean prime = true;

			if (num <= 1) {
				prime = false;
			} else {

				for (int j = 2; j < num; j++) {
					if (num % j == 0) {
						prime = false;
						break;
					}
				}

			}

			if (!prime) {
				System.out.print(num + " ");
			}

		}

		sc.close();
	}
}

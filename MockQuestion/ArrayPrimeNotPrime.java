
public class ArrayPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];

		System.out.println("Enter 10 numbers:");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Prime Numbers:");

		for (int i = 0; i < arr.length; i++) {

			if (isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}

		}

		System.out.println();

		System.out.println("Non Prime Numbers:");

		for (int i = 0; i < arr.length; i++) {

			if (!isPrime(arr[i])) {
				System.out.print(arr[i] + " ");
			}

		}

	}

	public static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}

		}

		return true;

	}

}

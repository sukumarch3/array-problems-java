import java.util.Scanner;

public class UniqueArrayElementsSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextInt();
		}
		long result = getUniqueArray(numbers);
		System.out.println("Array:" + result);
	}

	private static long getUniqueArray(int[] numbers) {
		long sum = 0;
		boolean[] array = new boolean[3000];
		for (int n : numbers) {
			for (; n < array.length && array[n]; n++)
				;
			array[n] = true;
			System.out.println("n:" + n);
			sum += n;
		}
		return sum;
	}

}

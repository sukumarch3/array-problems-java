import java.util.HashSet;
import java.util.Scanner;

public class CoutingPairs {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] numbers = new long[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scan.nextLong();
		}
		long k = scan.nextLong();
		int count = countPair(numbers, k);
		System.out.println(count);
	}

	private static int countPair(long[] numbers, long k) {
		int count = 0;
		HashSet<Long> set = new HashSet<>();
		for (int i = 0; i < numbers.length; i++) {
			if (set.add(numbers[i])) {
				if (set.contains(k + numbers[i])) {
					count++;
				}
				if (set.contains(Math.abs(numbers[i] - k))) {
					count++;
				}
			}
		}
		return count;
	}
}

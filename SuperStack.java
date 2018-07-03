import java.util.Scanner;

public class SuperStack {

	static int[] stack = new int[10000];
	static int top = -1;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		String split[][] = new String[n][];
		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			split[i] = s.split(" ");

		}
		for (int i = 0; i < n; i++) {
			System.out.println(performStackOps(split[i]));
		}
	}

	private static String performStackOps(String[] split) {
		switch (split[0]) {
		case "push":
			if (top + 1 == Integer.MAX_VALUE)
				return "Stack Overflow";
			stack[++top] = Integer.parseInt(split[1]);
			break;
		case "pop":
			if (top - 1 == -1)
				return "Stack UnderFlow";
			--top;
			break;
		case "inc":
			int offset = top - Integer.parseInt(split[1]);
			int inc = Integer.parseInt(split[2]);
			for (; offset <= top; offset++) {
				stack[offset] += inc;
			}
			break;
		default:
			return "Invalid Operation";
		}
		return top == -1 ? "EMPTY" : String.valueOf(stack[top]);
	}

}

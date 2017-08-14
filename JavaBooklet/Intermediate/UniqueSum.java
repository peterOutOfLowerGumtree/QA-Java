import java.util.Scanner;

public class UniqueSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THREE NUMBERS:");
		int int1 = sc.nextInt();
		int int2 = sc.nextInt();
		int int3 = sc.nextInt();
		uniqueSum(int1, int2, int3);
		sc.close();
	}

	private static void uniqueSum(int a, int b, int c) {
		if (a == b && a == c && b == c)
			System.out.println("SUM OF UNIQUE NUMERS = " + 0);
		else if (a == b)
			System.out.println("SUM OF UNIQUE NUMERS = " + c);
		else if (a == c)
			System.out.println("SUM OF UNIQUE NUMERS = " + b);
		else if (b == c)
			System.out.println("SUM OF UNIQUE NUMERS = " + a);
		else
			System.out.println("SUM OF UNIQUE NUMERS = " + (a + b + c));
	}
}

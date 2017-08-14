import java.util.Scanner;

public class BasicTasks {
	public static int[] arrayOfInts = new int[10];

	public static void main(String[] args) {
		arrayOfInts[0] = 0;
		arrayOfInts[1] = 2;
		arrayOfInts[2] = 1;
		arrayOfInts[3] = 4;
		arrayOfInts[4] = 3;
		arrayOfInts[5] = 6;
		arrayOfInts[6] = 5;
		arrayOfInts[7] = 5;
		arrayOfInts[8] = 3;
		arrayOfInts[9] = 7;

		// Hello World!
		System.out.println("Hello World!");

		// Assignment
		String newText = ("Hello World!");
		System.out.println(newText);

		// Parameters
		parametersEx("Hello World!");

		// Return types
		System.out.println(returnEx("Hello World!"));

		// Parameters/Operators
		System.out.println(paramOp(3, 5));

		// Conditionals
		conditionalsEx(3, 4, true);

		// Conditionals 2
		System.out.println(conditionalsEx2(2, 3, false));

		// Recursion
		recursion();

		// Arrays
		arrays();

		// Recursion/Arrays
		recArray1();

		// Recursion/Arrays 2
		recArray2();

		System.out.println();
		System.out.println();

		// Scanner
		scanner();
	}

	// Parameters
	public static void parametersEx(String m) {
		System.out.println(m);
	}

	// Return types
	public static String returnEx(String n) {
		return n;
	}

	// Parameters/Operators
	public static int paramOp(int a, int b) {
		return a + b;
	}

	// Conditionals
	public static void conditionalsEx(int a, int b, boolean bool) {
		if (bool)
			System.out.println(a + b);
		else
			System.out.println(a * b);
	}

	// Conditionals 2
	public static int conditionalsEx2(int a, int b, boolean bool) {
		if (a == 0)
			return b;
		else if (b == 0)
			return a;
		else if (bool)
			return a + b;
		else
			return a * b;
	}

	// Recursion
	public static void recursion() {
		for (int bCount = 0; bCount < 10; bCount++) {
			System.out.println(conditionalsEx2(bCount, 6, true));
		}
	}

	// Arrays
	public static void arrays() {
		for (int i = 0; i < arrayOfInts.length; i++) {
			for (int j = 0; j < arrayOfInts.length; j++) {
				System.out.println(conditionalsEx2(arrayOfInts[i], arrayOfInts[j], false));
			}
		}
	}

	// Recursion/Arrays
	public static void recArray1() {
		for (int i : arrayOfInts) {
			System.out.println(i);
		}
	}

	// Recursion/Arrays 2
	public static void recArray2() {
		int arrayOfInts2[] = new int[10];
		for (int i = 0; i < arrayOfInts2.length; i++) {
			arrayOfInts2[i] = i;
			System.out.print(i + " ");
		}

		System.out.printf("%n");

		for (int i : arrayOfInts2) {
			System.out.print(i * 10 + " ");
		}
	}

	// Scanner
	public static void scanner() {
		int length;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How long do you want the array?");
		length = scanner.nextInt();
		int arrayOfInts3[] = new int[length];

		for (int i = 0; i < arrayOfInts3.length; i++) {
			arrayOfInts3[i] = i;
			System.out.print(i + " ");
		}
		System.out.printf("%n");
		for (int j = 0; j < arrayOfInts3.length; j++) {
			System.out.print(j * 10 + " ");
		}
		scanner.close();
	}
}

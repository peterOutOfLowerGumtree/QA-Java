import java.util.*;

public class HelloWorldScanner {
	public static void main(String[] args) {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Say Hello!");
		input = scanner.next();

		if (input.equals("Hello") || input.equals("hello"))
			System.out.println("Leave me alone");
		else
			System.out.println("Hello");

		scanner.close();
	}
}
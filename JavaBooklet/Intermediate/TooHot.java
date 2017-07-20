import java.util.Scanner;

public class TooHot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER TEMPERATURE:");
		int temp = sc.nextInt();
		System.out.println();
		System.out.println("IS IT SUMMER? (true/false)");
		boolean isSummer = sc.nextBoolean();
		System.out.println();
		tooHot(temp, isSummer);
		sc.close();
	}

	public static void tooHot(int temperature, boolean isSummer) {
		int upperLimit;
		final int lowerLimit = 60;

		if (isSummer == true) {
			upperLimit = 100;
			if (lowerLimit <= temperature && temperature <= upperLimit) {
				System.out.println(true + " (temperature is within range)");
			} else
				System.out.println(false + " (temperature is not within range)");
		}

		else {
			upperLimit = 90;
			if (lowerLimit <= temperature && temperature <= upperLimit) {
				System.out.println(true + " (temperature is within range)");
			} else
				System.out.println(false + " (temperature is not within range)");
		}
	}
}

package main;

import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) throws Exception {
		int int1;
		int int2;
		Scanner sc = new Scanner(System.in);
		System.out.println("PLAYER 1 NUMBER:");
		int1 = sc.nextInt();
		System.out.println("PLAYER 2 NUMBER:");
		int2 = sc.nextInt();
		System.out.println("Blackjack Result:");
		System.out.println("*****************");
		blackjack(int1, int2);
		System.out.println(blackjack(int1, int2));
		sc.close();
	}

	public static String blackjack(int a, int b) {
		String s = "";
		if (a >= 0 && b >= 0) {
			if (a > 21 && b > 21)
				return "BOTH LOSE"; // 0
			else if (a == b)
				return "DRAW"; // 0
			else if (a > b && a < 22)
				return "PLAYER 1 WINS"; // a
			else if (b > a && b < 22)
				return "PLAYER 2 WINS"; // b
			else if (b < a && a > 21)
				return "PLAYER 2 WINS"; // b
			else if (a < b && b > 21)
				return "PLAYER 1 WINS"; // a
		} else {
			s = "ERROR"; // 0
		}
		return s;
	}
}

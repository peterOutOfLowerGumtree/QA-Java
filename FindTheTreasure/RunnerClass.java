import java.util.Random;
import java.util.Scanner;

public class RunnerClass {
	Player p = new Player("Bob", 4, 4);
	Treasure t = new Treasure("Gin", 0, 0);
	Compass c = new Compass();

	boolean isFound = false;

	public RunnerClass() { // put 1 where the player is positioned and 2 where
							// treasure is located,not really using it but for
							// future extensions
		int x, y;
		Random r = new Random();
		do {
			x = r.nextInt(10);
		} while (x == 4);
		do {
			y = r.nextInt(10);
		} while (y == 4);
		t.setxPos(x);
		t.setyPos(y);

	}

	public static void main(String[] args) {
		boolean isStarted = false;
		Scanner sc = new Scanner(System.in);
		RunnerClass runner = new RunnerClass();
		System.out.println("You awaken in a groggy haze. You have lost your gin.  Try 'look'");
		do {
			if (sc.next().equals("look")) {
				System.out.println("Grey foggy clouds float oppressively close to you" + "\n"
						+ "in the form of your responsibilities." + "\n"
						+ "The situation looks dire. You know that the only way" + "\n"
						+ "to get over this groggy haze is to find your gin." + "\n"
						+ "You notice a small compass-like device on the floor." + "\n"
						+ "It has hands like a watch, but the hands don't seem to tell time." + "\n"
						+ "It is probably a compass. Use it to find your gin." + "\n"
						+ "Move in a cardinal direction.");
				isStarted = true;
			}
		} while (!isStarted);

		while (runner.isFound == false) {
			runner.movePlayer(sc.next());
		}
		sc.close();

	}

	public void movePlayer(String move) {
		float distance = c.getDistance(p.getxPos(), p.getyPos(), t.getxPos(), t.getyPos());

		if (distance != 0)
			switch (move) {

			case "north":
				if (p.getyPos() == 0) {
					System.out.println("You've reached grid limit. Try another direction!");
					break;
				} else {
					p.setyPos(p.getyPos() - 1);
					break;
				}

			case "south":
				if (p.getyPos() == 9) {
					System.out.println("You've reached grid limit. Try another direction!");
					break;
				} else {
					p.setyPos(p.getyPos() + 1);
					break;
				}

			case "east":
				if (p.getxPos() == 9) {
					System.out.println("You've reached grid limit. Try another direction!");
					break;
				} else {

					p.setxPos(p.getxPos() + 1);
					break;
				}
			case "west":
				if (p.getxPos() == 0) {
					System.out.println("You've reached grid limit. Try another direction!");
					break;
				} else {
					p.setxPos(p.getxPos() - 1);
					break;
				}
			}

		distance = c.getDistance(p.getxPos(), p.getyPos(), t.getxPos(), t.getyPos());
		if (distance == 0) {
			{
				System.out.println("You have found your " + t.getName() + "!");
				this.isFound = true;
				System.exit(0);
			}
		}

		System.out.println("Distance: " + distance);
	}

}

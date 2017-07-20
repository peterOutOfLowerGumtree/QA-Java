import java.util.*;
import java.io.*;

public class PeopleCode {
	ArrayList<People> peopleList = new ArrayList<>();
	ArrayList<People> peopleListFromFile = new ArrayList<>();

	// Add People to File
	public void SpitToFile(ArrayList<People> peopleList) throws IOException {
		PrintWriter penguinPublishing = new PrintWriter("List of People.txt", "UTF-8");
		for (People p : peopleList) {
			penguinPublishing.println(p.toString());
		}
		penguinPublishing.close();
	}

	public void readFromFile(ArrayList<People> list) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("List of People.txt"));

		String line;
		while ((line = reader.readLine()) != null) {
			String[] parsedString = line.split(" ");
			list.add(new People(parsedString[0], parsedString[1], Integer.parseInt(parsedString[2])));
		}
		reader.close();

	}

	// Display peopleList in Console
	public void shitOutFirstList() {
		for (People p : peopleList) {
			System.out.println(p);
		}
	}

	// Display peopleList in Console
	public void shitOutSecondList() {
		for (People p : peopleListFromFile) {
			System.out.println(p);
		}
	}

}

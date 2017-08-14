import java.util.*;
import java.io.*;

public class PeopleCode {
	public ArrayList<People> peopleList = new ArrayList<>();
	public ArrayList<People> peopleListFromFile = new ArrayList<>();

	// Add People to File
	public void spitToFile(ArrayList<People> peopleList) throws IOException {
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
	public void spitFirstList() {
		for (People p : peopleList) {
			System.out.println(p);
		}
	}

	// Display peopleList in Console
	public void spitSecondList() {
		for (People p : peopleListFromFile) {
			System.out.println(p);
		}
	}

}

import java.util.*;

public class People {
	String name;
	int age;
	String jobTitle;

	static ArrayList<People> peopleList = new ArrayList<People>(100);

	public static void main(String[] args) {
		People p1 = new People("Adam", 30, "Builder");
		People p2 = new People("Barry", 69, "Retired");
		People p3 = new People("Charlotte", 22, "Unemployed");
		People p4 = new People("David", 19, "Student");
		People p5 = new People("Edna", 80, "Retired");
		People p6 = new People("Frankie", 26, "Doctor");

		addToList(peopleList, p1);
		addToList(peopleList, p2);
		addToList(peopleList, p3);
		addToList(peopleList, p4);
		addToList(peopleList, p5);
		addToList(peopleList, p6);

		printPeople();
	}

	// Constructor
	public People(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	public People() {
		name = "No name";
		age = 0;
		jobTitle = "Unemployed";
	}

	// Getter
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	// Add to Array
	public static void addToList(ArrayList<People> list, People people) {
		list.add(people);
	}

	// Print Array
	static void printPeople() {
		for (People p : peopleList) {
			System.out.println(p.getName() + " " + p.getAge() + " " + p.getJobTitle());
		}
	}
}
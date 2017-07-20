import java.io.IOException;

public class RunnerClass {
	public static void main(String[] args) throws IOException {

		PeopleCode p = new PeopleCode();
		People p1 = new People("Alex", "Student", 20);
		People p2 = new People("Bert", "Builder", 43);
		People p3 = new People("Chaz", "Student", 19);
		People p4 = new People("Dave", "Singer", 14);
		People p5 = new People("Eric", "Chimney_Sweep", 9);
		p.peopleList.add(p1);
		p.peopleList.add(p2);
		p.peopleList.add(p3);
		p.peopleList.add(p4);
		p.peopleList.add(p5);

		p.SpitToFile(p.peopleList);
		p.shitOutFirstList();
		p.readFromFile(p.peopleListFromFile);
		p.shitOutSecondList();
	}
}

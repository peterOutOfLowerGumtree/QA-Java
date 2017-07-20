import java.text.NumberFormat;

public class RunnerClass {

	public static void main(String[] args) {
		NumberFormat.getCurrencyInstance();
		Wizard w = new Wizard();
		Paint paint1 = new Paint("CheapoMax", 20, 19.99, 10);
		Paint paint2 = new Paint("AverageJoes", 15, 17.99, 11);
		Paint paint3 = new Paint("DuluxourousPaint", 10, 25.00, 20);
		w.paintList.add(paint1);
		w.paintList.add(paint2);
		w.paintList.add(paint3);

		/*
		 * w.shitOutList(); System.out.println(w.pricePerMetreSq(paint1));
		 */

		// Best Choice
		w.bestChoiceCheapest(100);

		// Wastes Least
		w.wasteLeast(5);
	}
}

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Wizard {
	public ArrayList<Paint> paintList = new ArrayList<>();

	public void shitOutList() {
		for (Paint p : paintList) {
			System.out.println(p);
		}
	}

	public double pricePerMetreSq(Paint paint) {

		double a = paint.getPrice();
		double b = paint.getSprayArea();
		double c = paint.getVolume();

		double x = a / (b * c);
		return x;
	}

	public void wasteLeast(double roomSize) {
		double remainder = 0;
		for (Paint p : paintList) {
			remainder = (roomSize*p.getSprayArea());
			remainder = remainder % p.getVolume();
			System.out.println(remainder);
		}
	}

	public void bestChoiceCheapest(double roomSize) {
		double cost = 0;
		for (Paint p : paintList) {
			double price = 0;
			price = pricePerMetreSq(p);
			cost = price * roomSize;
			DecimalFormat df = new DecimalFormat(".##");
			System.out.println("It will cost £" + df.format(cost) + " to paint your room with " + p.getName());
		}

	}
}


public class Paint {
	String name;
	double volume;
	double price;
	double sprayArea;

	public Paint(String name, double volume, double price, double sprayArea) {
		super();
		this.name = name;
		this.volume = volume;
		this.price = price;
		this.sprayArea = sprayArea;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getSprayArea() {
		return sprayArea;
	}

	public void setSprayArea(double sprayArea) {
		this.sprayArea = sprayArea;
	}

	@Override
	public String toString() {
		return "Paint [name=" + name + ", volume=" + volume + ", price=" + price + ", sprayArea=" + sprayArea + "]";
	}

}
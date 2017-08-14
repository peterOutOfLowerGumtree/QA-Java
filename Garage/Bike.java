public class Bike extends Vehicle {
	private boolean hasGears;

	public Bike(int id, int numberOfSeats, boolean hasGears, boolean isBroken) {
		super(id, "Bike", numberOfSeats, 50, isBroken);
		this.hasGears = hasGears;
	}

	public boolean isHasGears() {
		return hasGears;
	}

	public void setHasGears(boolean hasGears) {
		this.hasGears = hasGears;
	}
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", numberOfSeats="
				+ numberOfSeats + " hasGears=" + hasGears + "]";
	}
	
}

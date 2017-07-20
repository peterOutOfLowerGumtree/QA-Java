public class Car extends Vehicle {
	int numberOfDoors;

	public Car(int id, int numberOfSeats, int numberOfDoors, boolean isBroken) {
		super(id, "Car", numberOfSeats, 100, isBroken);
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", numberOfSeats="
				+ numberOfSeats + " numberOfDoors=" + numberOfDoors + "]";
	}
	
	
}
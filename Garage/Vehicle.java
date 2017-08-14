
public abstract class Vehicle {
	private int id;
	private String type;
	private int numberOfSeats;
	private int costOfRepair;
	private boolean isBroken;

	public Vehicle(int id, String make, int numberOfSeats, int costOfRepair, boolean isBroken) {
		super();
		this.id = id;
		this.type = make;
		this.numberOfSeats = numberOfSeats;
		this.costOfRepair = costOfRepair;
		this.isBroken = isBroken;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getCostOfRepair() {
		return costOfRepair;
	}

	public void setCostOfRepair(int costOfRepair) {
		this.costOfRepair = costOfRepair;
	}

	public boolean getIsBroken() {
		return isBroken;
	}

	public void setBroken(boolean isBroken) {
		this.isBroken = isBroken;
	}
	
	
	
}

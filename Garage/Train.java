public class Train extends Vehicle {
	private boolean hasTracks;

	public Train(int id, int numberOfSeats, boolean hasTracks, boolean isBroken) {
		super(id, "Train", numberOfSeats, 5000, isBroken);
		this.hasTracks = hasTracks;
	}

	public boolean isHasTracks() {
		return hasTracks;
	}

	public void setHasTracks(boolean hasTracks) {
		this.hasTracks = hasTracks;
	}
	
	@Override
	public String toString() {
		return "Train [id=" + id + ", numberOfSeats="
				+ numberOfSeats + " hasTracks=" + hasTracks + "]";
	}
	
}

public class Player {
	public String name;
	private int xPos;
	private int yPos;

	public Player(String name, int xPos, int yPos) {
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public int getxPos() {
		return xPos;
	}

	public void setxPos(int xPos) {
		this.xPos = xPos;
	}

	public int getyPos() {
		return yPos;
	}

	public void setyPos(int yPos) {
		this.yPos = yPos;
	}

	public String getName() {
		return name;
	}

}

public class Treasure {
	String name;
	int xPos;
	int yPos;

	public Treasure(String name, int xPos, int yPos) {
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
}

public class Compass {
	int gridSize;
	
	public float getDistance(int playerX, int playerY, int treasureX, int treasureY) {
		float newDistance;
		if (playerX == treasureX && playerY == treasureY)
			return 0;
		else if (playerX == treasureX && playerY != treasureY)
			newDistance = Math.abs(playerY - treasureY);
		else if (playerY == treasureY && playerX != treasureY)
			newDistance = Math.abs(playerX - treasureX);
		else
			newDistance = (float) Math.sqrt(
					((treasureX - playerX) * (treasureX - playerX)) + ((treasureY - playerY) * (treasureY - playerY)));

		return newDistance;
	}
}
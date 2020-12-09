public class Combination {
	
	public static final int POSITIONS_NUMBER = 4;
	protected final Position[] positions = new Position[POSITIONS_NUMBER];
	
	public Combination() {}
	
	public Combination(String legalString) {
		for (int currentPosition = 0;
				 currentPosition < POSITIONS_NUMBER;
				 currentPosition++) {
			char character = legalString.charAt(currentPosition);
			positions[currentPosition] = new Position(character);
		}
	}
	
	public String toString() {
		String string = "";
		for (int currentPosition = 0;
				 currentPosition < POSITIONS_NUMBER;
				 currentPosition++) {
			string = string.concat(
				String.valueOf(positions[currentPosition].getColor().toChar()));
		}
		return string;
	}

	public Color getColorOfItsPosition(int i) {
		return positions[i].getColor();
	}

	public static void main(String[] args) {
		
	}
	
}

enum Color {
	
	RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE;
	
	private final static int NUMBER_OF_COLORS_AVAILABLES = 6;
	public final static char[] characters = {'r', 'b', 'y', 'g', 'o', 'p'};
	public final static String charactersAsString = "rbygop";
	
	public static int numberOfColorsAvailables() {
		return NUMBER_OF_COLORS_AVAILABLES;
	}
	
	public char toChar() {
		if (this == Color.RED) {
			return 'r';
		} else if (this == Color.BLUE) {
			return 'b';
		} else if (this == Color.YELLOW) {
			return 'y';
		} else if (this == Color.GREEN) {
			return 'g';
		} else if (this == Color.ORANGE) {
			return 'o';
		} else if (this == Color.PURPLE) {
			return 'p';
		} else {
			return ' ';
		}
	}

	public static Color getRandomColor() {
		int RandomColorAsInteger =
			(int) (Math.random()*NUMBER_OF_COLORS_AVAILABLES);
		if (RandomColorAsInteger == 0) {
			return Color.RED;
		} else if (RandomColorAsInteger == 1) {
			return Color.BLUE;
		} else if (RandomColorAsInteger == 2) {
			return Color.YELLOW;
		} else if (RandomColorAsInteger == 3) {
			return Color.GREEN;
		} else if (RandomColorAsInteger == 4) {
			return Color.ORANGE;
		} else if (RandomColorAsInteger == 5) {
			return Color.PURPLE;
		}
		return null;
	}

	public static void main(String[] args) {
		
	}
	
}

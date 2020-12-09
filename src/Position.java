
public class Position {
	
	private Color color;
	
	public Position(Color color) {
		this.color = color;
	}
	
	public Position(char character) {
		if (character == 'r') {
			color = Color.RED;
		}
		if (character == 'b') {
			color = Color.BLUE;
		}
		if (character == 'y') {
			color = Color.YELLOW;
		}
		if (character == 'g') {
			color = Color.GREEN;
		}
		if (character == 'o') {
			color = Color.ORANGE;
		}
		if (character == 'p') {
			color = Color.PURPLE;
		}
	}

	public Color getColor() {
		return this.color;
	}

	public static void main(String[] args) {
		
	}

}

public class SecretCombination extends Combination {

	public SecretCombination() {
		this.set();
	}

	private void set() {
		do {
			for (int i = 0; i < POSITIONS_NUMBER; i++) {
				positions[i] = new Position(Color.getRandomColor());
			}
		} while (Checker.isWrongColorSingleness(this.toString()));
	}

	public static void main(String[] args) {
		
	}

}

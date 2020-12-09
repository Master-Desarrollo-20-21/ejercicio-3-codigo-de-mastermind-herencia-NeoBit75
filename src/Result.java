import java.util.ArrayList;

class Result {

	private ArrayList<Success> successes;
	
	private static boolean isWinner = false;
	
	public Result() {}

	public Result(SecretCombination sCombination,
			ProposedCombination pCombination) {
		successes = new ArrayList<Success>();
		for (int i = 0; i < Combination.POSITIONS_NUMBER; i++) {
			for (int j = 0; j < Combination.POSITIONS_NUMBER; j++) {
				if (sCombination.getColorOfItsPosition(i) ==
						pCombination.getColorOfItsPosition(j) && i == j) {
					successes.add(new Black());
				}
				if (sCombination.getColorOfItsPosition(i) ==
						pCombination.getColorOfItsPosition(j) && i != j) {
					successes.add(new White());
				}
			}
		}
		if (this.numberOfBlacks() == 4) {
			isWinner = true;
		}
	}

	public int numberOfBlacks() {
		int number = 0;
		for (int i = 0; i < successes.size(); i++) {
			if (successes.get(i) instanceof Black) {
				number++;
			}
		}
		return number;
	}

	public int numberOfWhites() {
		int number = 0;
		for (int i = 0; i < successes.size(); i++) {
			if (successes.get(i) instanceof White) {
				number++;
			}
		}
		return number;
	}
	
	public static boolean isWinner() {
		return isWinner;
	}
	
	public static void setNotToWinner() {
		isWinner = false;
	}

	public static void main(String[] args) {
		
	}

}

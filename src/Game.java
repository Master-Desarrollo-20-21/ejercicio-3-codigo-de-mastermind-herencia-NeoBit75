
public class Game {

	public static boolean isResumed() {
		if (Console.printResume().equals("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void start() {
		Console.printMastermindHeader();
		SecretCombination secretCombination = new SecretCombination();
		Attempt.realizeAll(secretCombination);
	}

	public static void main(String[] args) {
		
	}

}

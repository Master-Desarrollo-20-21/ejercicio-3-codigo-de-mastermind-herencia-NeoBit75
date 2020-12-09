import java.util.ArrayList;

class Attempt {

	private static final int MAX_NUMBER_OF_ATTEMPTS = 10;
	private static int numberOfAttemptsRealized;
	private static ArrayList<ProposedCombination> proposedCombinations;
	private static ArrayList<Result> results;

	public static void realizeAll(SecretCombination secretCombination) {
		numberOfAttemptsRealized = 0;
		proposedCombinations = new ArrayList<ProposedCombination>();
		results = new ArrayList<Result>();
		Result.setNotToWinner();
		do {
			realize(secretCombination);
		} while (numberOfAttemptsRealized <= MAX_NUMBER_OF_ATTEMPTS &&
				!Result.isWinner());
		realize(secretCombination);
	}

	private static void realize(SecretCombination secretCombination) {
		if (numberOfAttemptsRealized <= MAX_NUMBER_OF_ATTEMPTS) {
			Console.printAttempt(numberOfAttemptsRealized);
			System.out.println(secretCombination.toString());//temporal sentence
		}
		if (numberOfAttemptsRealized == 0) {
			proposingCombination();
			generateResult(secretCombination);
		} else if (numberOfAttemptsRealized != 0 && Result.isWinner()) {
			Console.printPrecedingResults(
					proposedCombinations, results, numberOfAttemptsRealized);
			Console.printYouHaveWon();
		} else if (numberOfAttemptsRealized < MAX_NUMBER_OF_ATTEMPTS &&
				!Result.isWinner()) {
			Console.printPrecedingResults(
					proposedCombinations, results, numberOfAttemptsRealized);
			proposingCombination();
			generateResult(secretCombination);
		} else if (numberOfAttemptsRealized == MAX_NUMBER_OF_ATTEMPTS &&
				!Result.isWinner()) {
			Console.printPrecedingResults(
					proposedCombinations, results, numberOfAttemptsRealized);
			Console.printYouHaveLost();
		}
		if (numberOfAttemptsRealized <= MAX_NUMBER_OF_ATTEMPTS) {
			numberOfAttemptsRealized++;
		}
	}
	
	private static void proposingCombination() {
		String proposingCombination;
		do
			proposingCombination = Console.introProposingCombination();
		while (Checker.isWrong(proposingCombination));
		proposedCombinations.add(
				new ProposedCombination(proposingCombination));
	}
	
	private static void generateResult(SecretCombination secretCombination) {
		results.add(
				new Result(
						secretCombination,
						proposedCombinations.get(numberOfAttemptsRealized)));
	}

	public static void main(String[] args) {
		
	}

}

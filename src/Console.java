import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Console {
	
	public static void printMastermindHeader() {
		System.out.print("----- MASTERMIND -----\n");
	}
	
	public static void printColorOf(Position position) {
		System.out.println(position.getColor());
	}

	public static void printAttempt(int i) {
		System.out.println("\n" + i + " attempt(s):");
		System.out.println("xxxx");
	}

	public static String introProposingCombination() {
		System.out.print("Propose a combination: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String proposingCombination = "";
		try {
			proposingCombination = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return proposingCombination;
	}

	public static void printWrongLength() {
		System.out.println("Wrong proposed combination length");
	}

	public static void printWrongColors() {
		System.out.println("Wrong colors, they must be: rbygop");
	}

	public static void printWrongColorSingleness() {
		System.out.println("Not to repeat colors");
	}

	public static void print(ProposedCombination proposedCombination) {
		System.out.print(proposedCombination);
	}

	public static void printArrow() {
		System.out.print(" --> ");
	}
	
	public static void printBlacksWhites(int nBlacks, int nWhites) {
		System.out.print(nBlacks + " blacks and " + nWhites + " whites\n");
	}

	public static void main(String[] args) {
		
	}

	public static void printPrecedingResults(
			ArrayList<ProposedCombination> proposedCombinations,
			ArrayList<Result> results,
			int numberOfAttemptsRealized) {
		for (int j = 0; j < numberOfAttemptsRealized; j++) {
			Console.print(proposedCombinations.get(j));
			Console.printArrow();
			Console.printBlacksWhites(
					results.get(j).numberOfBlacks(),
					results.get(j).numberOfWhites());
		}
	}

	public static void printYouHaveWon() {
		System.out.println("You've won!!! ;-)");
	}

	public static void printYouHaveLost() {
		System.out.println("You've lost!!! :-(");
	}

	public static String printResume() {
		System.out.print("RESUME? (y/n): ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String resume = "";
		try {
			resume = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n\n");
		return resume;
	}

}

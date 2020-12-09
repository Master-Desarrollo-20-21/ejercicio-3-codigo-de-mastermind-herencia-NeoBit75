class Checker {

	private static String proposingCombination;

	public static boolean isWrong(String _proposingCombination) {
		proposingCombination = _proposingCombination;
		if (isWrongLength()) {
			Console.printWrongLength();
		}
		if (isWrongColors()) {
			Console.printWrongColors();
		}
		if (isWrongColorSingleness()) {
			Console.printWrongColorSingleness();
		}
		return isWrongLength() |
			   isWrongColors() |
			   isWrongColorSingleness();
	}

	public static boolean isWrongLength() {
		if (proposingCombination.length() != 4) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isWrongColors() {
		for (int currentPosition = 0;
		currentPosition < proposingCombination.length();
		currentPosition++) {
			boolean isWrongColorAtCurrentPosition = true;
			for (int currentColor = 0;
			currentColor < Color.numberOfColorsAvailables();
			currentColor++) {
				if (proposingCombination.charAt(currentPosition) ==
					Color.characters[currentColor]) {
					isWrongColorAtCurrentPosition = false;
					break;
				}
			}
			if (isWrongColorAtCurrentPosition == true) {
				return true;
			}
		}
		return false;
	}

	public static boolean isWrongColorSingleness(String combination) {
		int[] counters = new int[Color.numberOfColorsAvailables()];
		for (int currentPosition = 0;
			 currentPosition < combination.length();
		     currentPosition++) {
			int indexOfChar =
					Color.charactersAsString.indexOf(
							combination.charAt(currentPosition));
			if (++counters[indexOfChar] > 1) {
				return true;
			}
		}

		return false;
	}

	public static boolean isWrongColorSingleness() {
		int[] counters = new int[Color.numberOfColorsAvailables()];
		if (!isWrongLength() && !isWrongColors()) {
			for (int currentPosition = 0;
			currentPosition < proposingCombination.length();
			currentPosition++) {
				int indexOfChar =
					Color.charactersAsString.indexOf(
						proposingCombination.charAt(currentPosition));
				if (++counters[indexOfChar] > 1) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
	}

 }

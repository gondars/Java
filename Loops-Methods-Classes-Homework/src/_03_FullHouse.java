/*
 * In most Poker games, the "full house" hand is defined as three cards of the same face + two cards of the same face, other than the first, 
 * regardless of the card's suits. The cards faces are "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" and "A". The card suits 
 * are "♣", "♦", "♥" and "♠". Write a program to generate and print all full houses and print their number.
 */

public class _03_FullHouse {

	public static void printCard(int number) {
		if (number < 11) {
			System.out.print(number);
		}
		else {
			switch (number) {
			case 11:
				System.out.print("J");
				break;
			case 12:
				System.out.print("Q");	
				break;
			case 13:
				System.out.print("K");
				break;
			case 14:
				System.out.print("A");
				break;
			}
		}
	}

	public static void printSuit(int number) {
        switch (number) {
		case 1:
			System.out.print('♣' + " ");
			break;
		case 2:
			System.out.print('♦' + " ");
			break;
		case 3:
			System.out.print('♥' + " ");
			break;
		case 4:
			System.out.print('♠' + " ");
			break;
		}

	}

	public static void main(String[] args) {

		int fullHouseCounter = 0;
		for (int threeEqual = 2; threeEqual < 15; threeEqual++) {
			for (int twoEqual = 2; twoEqual < 15; twoEqual++) {
				if (threeEqual != twoEqual) {
					for (int firstSuit = 1; firstSuit < 5; firstSuit++) {
						for (int secondSuit = firstSuit + 1; secondSuit < 5; secondSuit++) {
							for (int thirdSuit = secondSuit + 1; thirdSuit < 5; thirdSuit++) {
								for (int fourthSuit = 1; fourthSuit < 5; fourthSuit++) {
									for (int fifthSuit = fourthSuit + 1; fifthSuit < 5; fifthSuit++) {
										fullHouseCounter++;
										printCard(threeEqual);
                                						printSuit(firstSuit);
					                                        printCard(threeEqual);
					                                        printSuit(secondSuit);
					                                        printCard(threeEqual);
					                                        printSuit(thirdSuit);
					                                        printCard(twoEqual);
					                                        printSuit(fourthSuit);
					                                        printCard(twoEqual);
					                                        printSuit(fifthSuit);
					                                        System.out.println();
											}
								}
							}
						}
					}
				}
			}
		}
		// System.out.println(fullHouseCounter); // counter for how many Full Houses we have
	}
}
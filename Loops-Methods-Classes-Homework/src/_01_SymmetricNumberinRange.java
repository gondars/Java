/*
 * Write a program to generate and print all symmetric numbers in given range [start…end] (0 ≤ start ≤ end ≤ 999). A number is symmetric if its digits 
 * are symmetric toward its middle. For example, the numbers 101, 33, 989 and 5 are symmetric, but 102, 34 and 997 are not symmetric.
 */
import java.util.Scanner;

public class _01_SymmetricNumberinRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int minNumber = scanner.nextInt();
		int maxNumber = scanner.nextInt();
		scanner.close();
		answer(minNumber, maxNumber);
	}

	private static void answer(int minNumber, int maxNumber) {
		String[] numbersCheck = new String[maxNumber + minNumber];
		for (int i = minNumber; i <= maxNumber; i++) {
			numbersCheck[i] = Integer.toString(i);
			String reverse = new StringBuilder(numbersCheck[i]).reverse()
					.toString();
			if (numbersCheck[i].equals(reverse)) {
				System.out.println(i);
			}
		}

	}
}

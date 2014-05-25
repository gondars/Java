/*
 * Write a program to generate and print all 3-letter words consisting of given set of characters. For example if we have the characters 'a' and 'b', 
 * all possible words will be "aaa", "aab", "aba", "abb", "baa", "bab", "bba" and "bbb". The input characters are given as string at the first line of 
 * the input. Input characters are unique (there are no repeating characters).
 */
import java.util.Scanner;

public class _02_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		String[] eachLetters = new String[input.length()];
		for (int i = 0; i < input.length(); i++) {
			eachLetters[i] = input.substring(i, i + 1);
		}
		loop(input, eachLetters);
		scanner.close();

	}

	private static void loop(String input, String[] eachLetters) {
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < input.length(); j++) {
				for (int j2 = 0; j2 < input.length(); j2++) {
					System.out.printf("%s%s%s ", eachLetters[i],
							eachLetters[j], eachLetters[j2]);
				}

			}

		}
	}

}

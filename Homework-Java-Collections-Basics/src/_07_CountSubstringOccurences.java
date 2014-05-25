import java.util.Scanner;


public class _07_CountSubstringOccurences {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine().toLowerCase();
		String word = scanner.next().toLowerCase();
		int counter = 0;
				
		for (int i = 0; i <= sentence.length()-word.length(); i++) {
			if (sentence.substring(i,i+word.length()).contains(word)) {
				counter++;
			}
		}
		System.out.println(counter);

	}

}

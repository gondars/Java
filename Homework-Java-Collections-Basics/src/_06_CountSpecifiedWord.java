import java.util.Arrays;
import java.util.Scanner;


public class _06_CountSpecifiedWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().toLowerCase().split(" ");
		String input = scanner.next();
		int counter = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].contains(input)) {
				counter++;
			}
		}
		System.out.println(counter);
	}
}

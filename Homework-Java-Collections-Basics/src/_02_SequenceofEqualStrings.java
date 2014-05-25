import java.util.Scanner;

public class _02_SequenceofEqualStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split(" ");
		for (int i = 0; i < words.length; i++) {
			if (i < words.length-1) {

				if (words[i].equals(words[i + 1])) {
					System.out.print(words[i] + " ");
				} else {
					System.out.println(words[i]);
				}
				
			}
			else {
				if (words[i].equals(words[i-1])) {
					System.out.print(words[i]);
				}
				else {
					System.out.println(words[i]);
				}
			}
		}

	}

}

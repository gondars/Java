import java.util.Scanner;


public class _05_CountAllWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] words = scanner.nextLine().split("\\W+");
		System.out.println(words.length);

	}

}

import java.util.Scanner;


public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dec = scanner.nextInt();
		String hex = Integer.toHexString(dec);
		System.out.println(hex.toUpperCase());
		scanner.close();

	}

}

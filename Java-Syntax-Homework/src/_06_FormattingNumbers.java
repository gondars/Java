import java.awt.GridLayout;
import java.util.Scanner;


public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String hex = Integer.toHexString(a).toUpperCase();
		String bin = Integer.toBinaryString(a);
		String binpadded = String.format("%10s", bin).replace(' ', '0');
		float b = scanner.nextFloat();
		float c = scanner.nextFloat();		
		System.out.printf("|%s        |%s|     %.2f|%.3f     |",hex,binpadded,b,c);
        scanner.close();
	}

}

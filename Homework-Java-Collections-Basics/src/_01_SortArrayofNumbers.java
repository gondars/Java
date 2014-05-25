import java.util.Arrays;
import java.util.Scanner;


public class _01_SortArrayofNumbers {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	     int input = scanner.nextInt();
	     int[] nomberz = new int[input];
	     for (int i = 0; i < nomberz.length; i++) {
			nomberz[i] = scanner.nextInt();
		}
	     Arrays.sort(nomberz);
	     for (int i = 0; i < nomberz.length; i++) {
			System.out.print(nomberz[i] + " ");
		}

	}

}

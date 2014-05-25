/*
 * Write a method to convert from degrees to radians. Write a method to convert from radians to degrees. You are given a number n and n queries 
 * for conversion. Each conversion query will consist of a number + space + measure. Measures are "deg" and "rad". Convert all radians to degrees 
 * and all degrees to radians. Print the results as n lines, each holding a number + space + measure. Format all numbers with 6 digit after the decimal 
 * point.
 */
import java.util.Scanner;

public class _05_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int howmany = scanner.nextInt();
		String[] raddeg = new String[howmany];
		double[] numbers = new double[howmany];
		for (int i = 0; i < howmany; i++) {
			numbers[i] = scanner.nextDouble();
			raddeg[i] = scanner.next();
		}
		degtoRad(howmany, raddeg, numbers);
		radtoDec(howmany, raddeg, numbers);

		scanner.close();

	}

	private static void degtoRad(int howmany, String[] raddeg, double[] numbers) {
		for (int i = 0; i < howmany; i++) {
			if (raddeg[i].equals("deg")) {
				if (numbers[i] == 0) {
					System.out.printf("%f rad", numbers[i]);
					System.out.println();
				} else {
					System.out.printf("%f rad", numbers[i] / 57.2957795);
					System.out.println();
				}
			}

		}
	}

	private static void radtoDec(int howmany, String[] raddeg, double[] numbers) {
		for (int i = 0; i < howmany; i++) {
			if (raddeg[i].equals("rad")) {
				if (numbers[i] == 0) {
					System.out.printf("%f deg", numbers[i]);
					System.out.println();
				} else {
					System.out.printf("%f deg", numbers[i] * 57.2957795);
					System.out.println();
				}

			}

		}
	}

}

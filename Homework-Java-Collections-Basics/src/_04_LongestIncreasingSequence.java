import java.util.Scanner;


public class _04_LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[]arr = scanner.nextLine().split(" ");
		int[] numbers = new int[arr.length];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(arr[i]);
		}
		int counterTemp = 1;
		int counter = 1;
		int positionOfInt = 0;
		
		System.out.print(numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > numbers[i-1]) {
				counterTemp++;
				System.out.print(" "+numbers[i]);
			}else {
				counterTemp=1;
				System.out.println();
				System.out.print(numbers[i]);
			}
			if (counterTemp > counter) {
				counter=counterTemp;
				positionOfInt=i;
			}
		}
		System.out.println();
		System.out.print("Longest: ");
		for (int i = 0; i < counter - 1; i++) {
			System.out.print(numbers[positionOfInt-counter+1+i] + " ");
		}
		System.out.println(numbers[positionOfInt]);

	}

}

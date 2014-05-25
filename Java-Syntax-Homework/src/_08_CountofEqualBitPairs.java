import java.util.Scanner;
import java.math.*;

public class _08_CountofEqualBitPairs {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in);
		BigInteger n = scaner.nextBigInteger();
		int counter = 0;
		
		for (int i = 0; i < n.bitLength(); i++) {
			if(n.testBit(i)==n.testBit(i+1))
			{
				counter++;
			}
		}
		System.out.println(counter);
		scaner.close();

	}

}

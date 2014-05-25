import java.util.Scanner;
import java.math.*;


public class _07_CountofBitsOne {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    BigInteger a = scanner.nextBigInteger();
	    int counter = 0;
	    for (int i = 0; i < 16; i++) {
			if (a.testBit(i) ==true) {
				counter++;
			}
			
		}
	    System.out.println(counter);
	    scanner.close();
	  
	    

	}

}

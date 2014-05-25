Zadacha 9

import java.util.ArrayList;
import java.util.Scanner;


public class ebhahsd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> l1 = new ArrayList<>();
		char[] chars;
		String[] inputStrings = scanner.nextLine().split(" ");
		for (int i = 0; i < inputStrings.length; i++) {
			for (int j = 0; j < 1; j++) {
				chars=inputStrings[i].toCharArray();
				l1.add(chars[j]);
			}
			
		}
		ArrayList<Character> l2 = new ArrayList<>();
		String[] inputStrings2 = scanner.nextLine().split(" ");
		
		for (int i = 0; i < inputStrings2.length; i++) {
			for (int j = 0; j < 1; j++) {
				chars=inputStrings2[i].toCharArray();
				l2.add(chars[j]);
			}
			
		}
		l2.removeAll(l1);
		l1.addAll(l2);
		
		System.out.println(l1);
 

	}

}

Zadacha 8

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mamitoti {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Matcher m = Pattern.compile("[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-]+").matcher(input);
		while (m.find()) {
			System.out.println(m.group());
			
		}

	}

}

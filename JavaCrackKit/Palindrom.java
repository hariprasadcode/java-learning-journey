package technical_round;

import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String rev = new StringBuilder(str).reverse().toString();
		if (rev.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		scan.close();

	}

}

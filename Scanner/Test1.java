// Program: Simple Calculator using Scanner
// Purpose: To practice user input in Java using Scanner class

package dom;

// Importing Scanner class from java.util package to take user input
import java.util.Scanner;

public class Test1 {

	// Main method - program execution starts here
	public static void main(String[] args) {

		/* 
		 Scanner is a predefined class in java.util package.
		 It is used to take input from the user through keyboard.
		*/
		Scanner scan = new Scanner(System.in);

		// Display welcome message
		System.out.println("Welcome to Next Version of Calculator");
		System.out.println();

		// Taking first number from user
		System.out.print("Enter 1st number : ");
		int a = scan.nextInt();

		// Taking second number from user
		System.out.print("Enter 2nd Number : ");
		int b = scan.nextInt();

		System.out.println();

		// Displaying calculator options
		System.out.println("Choose any one Option \n 1 for Addition \n 2 for Subtraction \n 3 for Multiplication \n 4 for Division ");

		// Taking user choice
		System.out.print("Your Choice : ");
		int op = scan.nextInt();

		System.out.println();

		// Performing operation based on user choice
		if (op == 1) {
			int sum = a + b; // Addition
			System.out.print("The sum of " + a + " and " + b + " is : " + sum);
		}

		else if (op == 2) {
			int sub = a - b; // Subtraction
			System.out.print("The difference between " + a + " and " + b + " is : " + sub);
		}

		else if (op == 3) {
			int mul = a * b; // Multiplication
			System.out.print("The product of " + a + " and " + b + " is : " + mul);
		}

		else if (op == 4) {
			int div = a / b; // Division
			System.out.print("The quotient of " + a + " and " + b + " is : " + div);
		}

		else {
			// Executes when user enters an invalid option
			System.out.println("Wrong Option");
		}

		System.out.println();
		System.out.println("Thank you");
		// Closing scanner object (good programming practice)
		scan.close();
	}
}
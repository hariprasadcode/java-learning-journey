/* This program is used to recap all the concepts that I learned this week.

   Concepts covered:
   1. Class
   2. Variable declaration and initialization
   3. Object creation
   4. Default values
   5. Keywords
   6. Methods and the 4 types of methods
   7. Reinitialization of variables
   8. How to call methods from another method
*/

package dom;

public class Weak1 { // Creating a class

	// Declaration and initialization of variables
	int id = 101;
	String name = "Ram";
	int age = 20;
	String city = "Benglour";
	String college = "SU";

	// Variable declared but not initialized.
	// For int type variables, the default value will be 0.
	int backLogs;

	// Creating methods that will be called from another method

	// Type 1 Method: Without Argument and Without Return Statement
	public void Welcome() {

		System.out.println("*******************");
		System.out.println("Welcome To Portal");
		System.out.println("--------------------");

	}

	// Type 2 Method: With Argument but Without Return Statement
	public void collegeName(String cn) {
		System.out.println("College Name : " + cn);
	}

	// Type 3 Method: Without Argument but With Return Statement
	public String userName() {
		return "Ramcode";
	}

	// Type 4 Method: With Argument and With Return Statement
	public double avg(int a, int b, int c) {
		double result1 = (a + b + c )/ 3;
		return result1;
	}

	// Creating the main method where program execution starts.
	// It is not required for compilation but required for execution.

	public static void main(String[] args) {

		// Creating an object to call the methods of the class
		Weak1 w1 = new Weak1();

		// Calling the methods
		w1.Welcome();

		w1.collegeName("su");

		String result = w1.userName();
		System.out.println("User Name : " + result);

		double result1 = w1.avg(50, 78, 97);
		System.out.println("Average Mark : " + result1);

		// Creating another object
		Weak1 w11 = new Weak1();

		// Printing the values that are initialized inside the class
		System.out.println("ID : " + w11.id);
		System.out.println("Name : " + w11.name);
		System.out.println("Age: " + w11.age);
		System.out.println("Back Logs : "+w11.backLogs);  // Default Value for int is 0 will be priting as its not initialized

		// Reinitializing the value of a variable
		w11.college = "SMVT";
		System.out.println("New College name : " + w11.college);
		System.out.println("-------------------------");

	}

}
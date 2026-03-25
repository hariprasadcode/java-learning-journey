/*When ever there is a static Block it executes automatically when the class is loaded  into memory.
 * to Execute Constructor and  non static block we need to create a Object inside a method. 
 * within CONSTRUCTOR and  NON STATIC BLOCK, non static block is given 1st preference so it executes 1st and then constructor .
 *  u can see in the output :
   
        inside a static Block
        inside main method 1
        inside non static block
        Inside a Constructor
        inside  main method 2
 **/

package dom;

public class Bike {
	// non static block
	{
		System.out.println("inside non static block");
	}

	// constructor
	public Bike() {
		System.out.println("Inside a Constructor");
	}

	static {
		System.out.println("inside a static Block");
	}

	public static void main(String[] args) {
		System.out.println("inside main method 1 ");
		Bike b = new Bike();
		System.out.println("inside main method 2");
	}
}

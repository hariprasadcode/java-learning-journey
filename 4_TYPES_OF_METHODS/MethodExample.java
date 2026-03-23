package demo1;

public class MethodExample {
	//Method without Arguments, without Return Statement
	//This method simply prints a message to the console
	public void test() {
		System.out.println("Learning Methods");
	}
     
	public static void main(String[] args) {
		
		System.out.println("Starts");
		System.out.println("-------");
		
		//creating and object me
		MethodExample me = new MethodExample();
		

        // Calling the 'test' method using the object 'me'
        // This will execute the code inside the 'test' method
		me.test();
		
		System.out.println("-------");
		System.out.println("Ends");
		
	}
}


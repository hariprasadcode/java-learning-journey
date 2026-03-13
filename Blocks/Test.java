package static_block;
/*Initializing static variable inside the static Block*/
public class Test {
	
	static int a;
	static {
		a=20;
		System.out.println("inside a static "+a);
	     }
	public static void main(String[] args) {
		System.out.println("inside main method");
	}

}

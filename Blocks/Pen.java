package static_block;
/*observing the Execution order while having multiple static Block*/
public class Pen {
	
	//static String pen;

	static
	{
		System.out.println("inside the static block 1");
		//pen="Parker";
	}
	
    public static void main(String[] args) {
		System.out.println("inside the main method");
	}
	
	static
	{
		System.out.println("inside the static block 2");
	}
	
	static
	{
		System.out.println("inside the static block 3");
	}
	
	
	
}

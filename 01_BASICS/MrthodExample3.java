package demo1;

public class MrthodExample3 {
	
	//method without argument with return statement
	
	public int print(){
		return 50;
	}
 
	public String Display() {
		return "Dhee Coding Lab";
	}
	
	public static void main(String[] args) {
		MrthodExample3 me3 = new MrthodExample3();
		 // calling print() method
		
		int result = me3.print();
		
		System.out.println("result");
		System.out.println(me3.print());
		
		//calling display() method
		
		String message = me3.Display();
		
		System.out.println(message);
		System.out.println(me3.Display());
	}
}

package dom;
/*A static variables can be reinitialized but if it reinitialized , then the reinitialized values will be the parmanent value for not the previous one.
 * 
 * and a static variables can be called by using the object but its NOT the CORRECT PRACTICE.
 * 
 * This example is just to show static can also called using object but not proper way . and it can also be reinitialized but it will be te parmanent.
 * */
public class Task {

	static int id=12;
	static String name="jhon";
	static int age=15;
	String collegeName="svs";
	
	public  void info() {
		System.out.println("College Name : "+collegeName);
		System.out.println("Student Id : "+id);
		System.out.println("Student name: "+name);
		System.out.println("Student Age : "+age);
		
	}
	
	public static void main(String[] args) {
		
		Task t1=new Task();
		t1.info();
		System.out.println();
		Task t2=new Task();
		t2.id=13;// reinitializing static variable
		t2.info();
		System.out.println();
		Task t3=new Task();
		t3.info();  // as its showing reinitialized value .
		
		
		
		
	}
	
	
	
	
}

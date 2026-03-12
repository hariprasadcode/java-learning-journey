package dom;
/*A static variables can be reinitialized but if it reinitialized , then the reinitialized values will be the parmanent value , not the previous one whic we initialized defore in class.
 * 
 * A static variables can be called by using the object but its NOT the CORRECT PRACTICE.
 * 
 * This example is just to show static can also called using object but its  not proper way . and it can also be reinitialized but it will be te parmanent.

 SO WE SHOULD NOT REINITIALIZE THE STATIC VARIABLES AND WE SHOULD  CALL STATIC METHODS OR VARIABLES IN ITS OWN WAY NOT BY NON STATIC WAY
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


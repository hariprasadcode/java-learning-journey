// Example for non static block  
package dom;
public class Pen {
	//declaring non static variable
	String pen;
	//creating a non static block
	{
		pen="montex";
		System.out.println(pen);
	}
	public static void main(String[] args) {
		Pen p=new Pen();
	}
}
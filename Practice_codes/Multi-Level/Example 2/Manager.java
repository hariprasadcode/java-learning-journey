package multi_level;

public class Manager extends Human {
	
	public void responsibility() {
		String one ="Manages Team";
		String two ="Dustributes Work";
		String three="Time management";		
		System.out.println("Responsibilitys : " +one +" , "+ two +" ,"+ three);
	}
	public static void main(String[] args) {
		Human h1=new Human();
		h1.emotions();
		h1.does();
	}
	
 }

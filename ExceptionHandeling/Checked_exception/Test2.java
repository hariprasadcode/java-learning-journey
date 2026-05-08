package checked_exception;

public class Test2 {
	
	public static void main(String[] args) {
	System.out.println("start");
	
	try {
	Class.forName("mysql.cj.jdbc.driver");
	}
	catch(ClassNotFoundException e) {
     e.printStackTrace();
	}
	System.out.println("end");
	}

}

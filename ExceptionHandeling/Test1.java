package checked_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test1 {
	public static void main(String[] args) {
	  System.out.println("start");
	  
	  try {
	  FileReader fr =new FileReader("demo.txt");
	  }
	  catch(FileNotFoundException e) {
		  System.out.println(e.getMessage());
	  }
	  System.out.println("end");
		
	}

}

package generics;
import java.util.*;
public class StudentApp {
	public static void main(String[] args) {
		Student s1= new  Student(101, "Ram");
		Student s2= new Student(102,"Sham");
		Student s3= new Student(103,"Shiv");
		Student s4= new Student(104,"Shanker");
		
		ArrayList <Student> sList= new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(new Student(105,"Kiran"));
		
		for(Student s: sList) {
			System.out.println(s);
		}
		
	}

}

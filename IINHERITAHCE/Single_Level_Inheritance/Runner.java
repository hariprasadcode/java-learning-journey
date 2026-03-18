package single_level;

public class Runner {
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="William";
		s1.age=19;
		s1.college="oxford";
		s1.id=101;
		s1.study();
		s1.walk();
		
		System.out.println("Name : "+s1.name);
		System.out.println("Age : "+s1.age);
		System.out.println("College : "+s1.college);
		System.out.println("Id : "+s1.id);
		
		
		
	}

}

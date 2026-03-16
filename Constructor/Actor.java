package snippet;

public class Actor {

	int id;
	int age;
	String name;
	String industry;
	double height;
	
	Actor(int id, int age, String name,String industry,double height)
	{
		this.id=id;
		this.age=age;
		this.name=name;
		this.industry=industry;
		this.height=height;
		
	}
	
	public static void main(String[] args) {
		Actor a1=new Actor(1, 30, "allu","Tollywood", 5.7);
		System.out.println(a1.id);
		System.out.println(a1.age);
		System.out.println(a1.name);
		System.out.println(a1.industry);
		System.out.println(a1.height);

	}
	
}

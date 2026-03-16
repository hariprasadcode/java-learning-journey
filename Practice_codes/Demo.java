package snippet;

public class Demo {
	
	static {
		System.out.println(30);
	}

	{
		System.out.println(40);

	}
	
	Demo(){
		System.out.println(50);

	}
	public static void main(String[] args) {
		System.out.println(10);
		
		Demo demo=new Demo();

	}
}

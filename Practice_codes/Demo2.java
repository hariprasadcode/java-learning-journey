package snippet;

public class Demo2 {
	
	static int a=10;
	int b=20;
	
	static {
		a=30;
	}
	static {
		System.out.println(a);
		a=150;
		System.out.println(a);
	}
	
	{
		a=45;
		b=65;
		System.out.println(a);
	}
	Demo2(){
		System.out.println(a);
		a=75;
	}
	public static void main(String[] args) {
		a=95;
				System.out.println(a);
				Demo2 demo=new Demo2();
				System.out.println(a);
				System.out.println(demo.b);

	}

}

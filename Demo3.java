package snippet;

public class Demo3 {
	
	int a=400;  // global Variable
	
	Demo3()
	{
		int a=300; //local variable
		System.out.println(a);
		System.out.println(this.a);

	}
	public static void main(String[] args) {
		Demo3 demo3 = new Demo3();
	}

}

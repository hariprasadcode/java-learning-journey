package demo1;

class MethodExample2 {
            //1 with argument without return statement
	public void add(int a,int b) {
		int sum=a+b;
		System.out.println("The Sum of"+a +" and " +b+" ="+ sum);
	}
	public static void main(String[] args)
	{
		    MethodExample2 me2 = new MethodExample2();
	        
		    me2.add(20, 40);
	}
	
}


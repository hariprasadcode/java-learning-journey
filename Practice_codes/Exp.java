package com;
/*creating a class and initialized it */
class Exp {
	
	/*we cannot reinitialize a variable if we use final keyword with variable*/
	final int a=10;
	double b=10;
	
	/* static variable*/
	static int c;
	
	
	/*static variable  it will be executed before main method */
	static {
		c=10;
	}
	
	
	/* creating a non static block , so without object creation non static block wont run,*/
	{
		System.out.println("inside a non static block");
	}
	
	
	/* constructor is a set of instruction and  used to initialize non static variables,
	 *  and constructor which runs when we create object .but non static block is 1st prioritized that constructor*/
    Exp(){
    	System.out.println("inside constructor");
    }
    
	
	/*Method is a set of instruction used to perform some task 
	 * we can create in 4 ways  
	 * method is executed when it is called from another class*/
    public void meth1() {
    	double sum=a+b;
    	System.out.println(sum);
    }
    
  /*by using final keyword in method we cannot override it 
   * we can inherit but cannot override*/
    public final void meth2() {
    	double sub=a-b;
    	System.out.println(sub);
    }



	/*main method */
	public static void main(String[] args) {
		
		/*object creation , after creation object non-static block , constructor will execute 
		 * to call a method we need  to create a object*/
		Exp ex = new Exp();
		System.out.println(ex.a);
		
		/* creating array and initializing*/
	    int[] age = {10,20,30};
	    System.out.println(age[2]);
		
		/*calling meth1 so to call a meth1 we need to create a object and mention which method*/
		ex.meth1();
		ex.meth2();
		
		
		System.out.println(age[0]);
	
		
	}

}

package demo;

class DefValueExample {
	// non static variables
	int a;  //0
	double b; //0.0
	boolean c;//false
	char d; // NUL Character or  \u0000,  unicode value = 0
	String e; //NULL
	
	
	public static void main(String[] args) {
		DefValueExample dve = new DefValueExample();
         System.out.println(dve.a);
         System.out.println(dve.b);
         System.out.println(dve.c);
         System.out.println(dve.d);
         System.out.println(dve.e);
         
	 }

}

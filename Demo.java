package keyword;

/*If we using final keyword for class we cannot inherit this class*/
final public class Demo {
	
	final int a=10; // Cannot reinitialize this variable
	
	/*Cannot override the method if we using final keyword in methods*/
	public final void meth1(int b,int c) {
		int sum=b+c;
	}
	
}

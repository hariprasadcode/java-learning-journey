package string_constructor;

public class test {

	public static void main(String[] args) {
		/*1 empty representation of string object*/
		String s1=new String();//similar to string s1="";
		System.out.println(s1);
		
		System.out.println("------------");
		
		/*2 constructor accepting sequence id char*/
		String s2= new String("hello");
		System.out.println(s2);
		
		System.out.println("----------");
		
		/*passing char[] in the constructor parameter 
		 * which will be converted into a string*/
		char[] c= {'j','a','v','a'};
		String s3= new String(c);
		System.out.println(s3);
	}

}

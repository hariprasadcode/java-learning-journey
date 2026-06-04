package set.examples;

public class CompareToExample {
	public static void main(String[] args) {
		String s1="A";
		String s2="B";
		System.out.println(s1.compareTo(s2));
		System.out.println(s2.compareTo(s1));
		System.out.println(s1.compareTo(s1));
		System.out.println();
		
		Integer n1=10;
		Integer n2=20;
		System.out.println(n1.compareTo(n2));
		System.out.println(n2.compareTo(n1));
		
		System.out.println();
		
		Double d1=99.99;
		Double d2=88.88;
		System.out.println(d1.compareTo(d2));
		System.out.println(d2.compareTo(d1));
	}

}

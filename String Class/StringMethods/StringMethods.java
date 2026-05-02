package string_methods;

public class StringMethods {
	public static void main(String[] args) {
		/*s1 get de referenced 2 times */
		String s1="Programing";
		String s2="programing";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("-------------");
		System.out.println(s1.length());
		System.out.println("-------------");
		System.out.println(s1.charAt(2));
		System.out.println("-------------");
		System.out.println("------comparison methods-------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("-------------");
		System.out.println("------searching methods-------");
		System.out.println(s1.contains("ing"));
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.startsWith("pro"));
		System.out.println(s1.endsWith("ing"));
		System.out.println("-------------");
		System.out.println("------modification Method-------");
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(3,6));
		System.out.println(s1.replace('a', 'o'));
		System.out.println(s1.trim());
		System.out.println("------coversion method-------");
		System.out.println(s1.toCharArray());
		System.out.println(s1.getBytes());
		System.out.println("------utility Methods-------");
		System.out.println(s2.split(","));
		System.out.println(s1.join("-","p","r","o"));

	}

}

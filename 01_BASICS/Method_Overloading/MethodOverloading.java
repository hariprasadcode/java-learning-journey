package com;


/*Method Overloading
  RULES OF METHOD OBERLOADING
   1 There should be change in a number of Argument.
   2 There should be change in the Data Type of the Argument,
   3 There should be change in the Sequence /order of the Argument */
public class MethodOverloading {

	//Creating many methods with same name and  following the rule.
	
	public void mo() {
		System.out.println("Welcome To The World Of JAVA FULL STACK DEVELOPMENT");
	}

	public void mo(String sub) {
		System.out.println("The Subject is : " + sub);
	}

	public void mo(String top, int hrs) {
		System.out.println("The Topic is " + top + " for " + hrs + " Hours");
	}

	public void mo(int pn, String book) {
		System.out.println("Book name : " + book + " Page Number : " + pn);
	}
	public String mo(int pne) {
		return "Till Page No " + pne;

	}

}

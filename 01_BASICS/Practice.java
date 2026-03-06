package com;

public class Practice {

	// without argument without return statement
	public void WelcomeMessage() {
		System.out.println("WelcomeTo Students Portal");
	}

	// with argument without return statement
	public void StudentName(String name, int mark) {
		if (mark >= 35) {
			System.out.println(name + " Pass");
		} else {
			System.out.println(name + " Fail");
		}
	}

	// without argument with return type
	public String CollegeName() {
		return "Srinivas University";
	}
	
	// with argument with return type
	public double CalculateAverage(int science, int maths, int social) {
		double Average = (science + maths + social)/ 3;
		return Average;

	}

	public static void main(String[] args) {
		Practice p = new Practice();

		p.WelcomeMessage();

		p.StudentName("Jhon", 40);

		p.CollegeName();
		String CollegeName = p.CollegeName();
		System.out.println("College Name is : " + CollegeName);

		double Average = p.CalculateAverage(78, 23, 67);
		System.out.println("Average Marke is " + Average);

	}

}

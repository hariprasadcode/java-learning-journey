package single;

import java.util.Scanner;

public class Employe extends Company {
	static {
		System.out.println("Name should be in Uppercase");
	}

	public void work() {
		Company com = new Company();

		Scanner scan = new Scanner(System.in);
		System.out.print("Name : ");
		String name = scan.next();
		System.out.print("Id : ");
		int id = scan.nextInt();
		if (name.equals("VIRAT")) {
			if (id == 101) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depJavaFull();

			} else if (id == 102) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depPythonFull();

			} else {
				System.out.println("Id is not Matching");
			}
		} else if (name.equals("ROHIT")) {
			System.out.println("Company : " + com.companyName);
			System.out.println("Branch : " + com.branch);
			com.depPythonInt();

		} else if (name.equals("DHONI")) {
			if (id == 104) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depSoftFull();

			} else if (id == 105) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depTechFull();

			} else {
				System.out.println("Id is not maching");
			}
		} else if (name.equals("PANDYA")) {
			if (id == 106) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depTechFull();

			} else {
				System.out.println("Id is not Matching");
			}

		} else if (name.equals("RAHUL")) {
			if (id == 107) {
				System.out.println("Company : " + com.companyName);
				System.out.println("Branch : " + com.branch);
				com.depTechInt();

			} else {
				System.out.println("Id is not matching");
			}
		} else {
			System.out.println("No Employe named " + name + " with Id " + id);
		}
	}

	public static void main(String[] args) {
		Employe e1 = new Employe();
		e1.work();
	}
}

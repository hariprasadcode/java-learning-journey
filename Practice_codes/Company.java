package com;

public class Company {
	
    static String companyName = "TechSoft";

    String employeeName = "Dev";

    void display() {
        System.out.println(employeeName + " works at " + companyName);
    }

    public static void main(String[] args) {

        Company c1 = new Company();
        Company c2 = new Company();

        c1.employeeName = "Riya";

        c2.display();
    }
}



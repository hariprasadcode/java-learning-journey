package com;

public class Experiment {
	static {
		System.out.println("Student Details");
	}
		
		public void studentDetails() {
		int[] id= {101,102,103,104,105};
		String[] name= {"Jhon","Robert","Ram","Raj","Shami"};
		int[] mark= {97,35,47,87,56};
			
		System.out.println("\nId : "+id[0]+" \nName : "+name[0]+" \nMark : "+mark[0]);
        if(mark[0]>=90) {
			
			System.out.println("Grade : A+");
		}
        else if (mark[0]>=70) {
			System.out.println("Grade : A");
        }
        else if (mark[0]>=50) {
			System.out.println("Grade : B");

        }
        else if(mark[0]>=35) {
			System.out.println("Grade : fail");

        }
        else {
        	System.err.println("Fail");
        }
        
		System.out.println("\nId : "+id[1]+" \nName : "+name[1]+" \nMark : "+mark[1]);
		
        if(mark[1]>=90) {
			
			System.out.println("Grade : A+");
		}
        else if (mark[1]>=70) {
			System.out.println("Grade : A");
        }
        else if (mark[1]>=50) {
			System.out.println("Grade : B");

        }
        else if(mark[1]>=35) {
			System.out.println("Grade : fail");

        }
        else {
        	System.err.println("Fail");
        }
		
		System.out.println("\nId : "+id[2]+" \nName : "+name[2]+" \nMark : "+mark[2]);
		
       if(mark[2]>=90) {
			
			System.out.println("Grade : A+");
		}
        else if (mark[2]>=70) {
			System.out.println("Grade : A");
        }
        else if (mark[2]>=50) {
			System.out.println("Grade : B");

        }
        else if(mark[2]>=35) {
			System.out.println("Grade : fail");

        }
        else {
        	System.err.println("Fail");
        }
		System.out.println("\nId : "+id[3]+" \nName : "+name[3]+" \nMark : "+mark[3]);
        if(mark[3]>=90) {
			
			System.out.println("Grade : A+");
		}
        else if (mark[3]>=70) {
			System.out.println("Grade : A");
        }
        else if (mark[3]>=50) {
			System.out.println("Grade : B");

        }
        else if(mark[3]>=35) {
			System.out.println("Grade : fail");

        }
        else {
        	System.err.println("Fail");
        }
		System.out.println("\nId : "+id[4]+" \nName : "+name[4]+" \nMark : "+mark[4]);
		
      if(mark[4]>=90) {
			
			System.out.println("Grade : A+");
		}
        else if (mark[4]>=70) {
			System.out.println("Grade : A");
        }
        else if (mark[4]>=50) {
			System.out.println("Grade : B");

        }
        else if(mark[4]>=35) {
			System.out.println("Grade : fail");

        }
        else {
        	System.err.println("Fail");
        }

		
	}
		public static void main(String[] args) {
			Experiment ex = new Experiment();
			ex.studentDetails();
			
		}

}

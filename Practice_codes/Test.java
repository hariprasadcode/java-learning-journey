package com;

public class Test {
	 

	    static int x = 10;

	    void change() {
	        x = x + 5;
	    }

	    public static void main(String[] args) {

	        Test t1 = new Test();
	        Test t2 = new Test();

	        t1.change();
	        t2.change();

	        System.out.println(x);
	    }
	}

	
	


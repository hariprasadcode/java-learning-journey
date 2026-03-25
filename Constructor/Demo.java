package com;

class Demo {
	
	Demo(){
		this(4);
	  System.out.println(1);
	}
	Demo(int a){
		System.out.println(2);
	}
	public static void main(String[] args) {
		Demo d = new Demo();
	}

}

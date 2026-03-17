package com;

public class Practice {
	// global variable ,as it is declared directly in class
   int id= 1; 
   String name="Ram";
   
   
   //Instance Block, containing local variable
   {
	   int id=2;// this id is different that global variable id
	   String name="Sham" ; 
	   System.out.println(id+name);
   }
   
   static {
	   int id=3;
	   String name ="Ravi";
	   System.out.println(id+name);
   }
   
   Practice(int id ,String name){
	System.out.println("inside consructor : "+id+name);
   }
   public static void main(String[] args) {
	Practice p1=new Practice(4, "ramesh");
	
	System.out.println();
	
}
   
   
   
   
	
	
}

package com;

public class Actor {

	int age;
	String name;
	String industray;
	Actor(int age, String name, String industray ){
		this.age=age;
		this.name=name;
		this.industray=industray;
	}
	
	@Override
	public String toString() {
		
		return "age "+age+", name "+name+", industray "+industray;
	}
	public static void main(String[] args) {
		Actor a1= new Actor(65, "balayya", "tollywood");
		Actor a2= new Actor(56, "yash", "sandalwood");
		Actor a3= new Actor(75, "vikram", "Kollywood");
		
       Actor[] actors = new Actor[3];
       actors[0]=a1;
       actors[1]=a2;
       actors[2]=a3;
       for(int i=0;i<actors.length;i++) {
    	   System.out.println(actors[i]);
       }


	}
}

package treeset.compare;

import java.util.TreeSet;

public class SortUser {
public static void main(String[] args) {
	User u= new User(101, "chris");
	User u1= new User(104, "adem");
	User u2= new User(100, "jhon");
	
	TreeSet <User> ts= new TreeSet<>();
	ts.add(u2);
    ts.add(u1);
    ts.add(u);
    
    for(User a:ts) {
    	System.out.println(a);
    }
}
}

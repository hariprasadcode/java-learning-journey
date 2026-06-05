package treeset.compare;

public class User implements Comparable<User>{
	
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int compareTo(User anotheruser) {
		return this.name.compareTo(anotheruser.name);
	}

}

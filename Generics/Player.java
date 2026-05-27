package generics;

public class Player {
	
	String name;
	String team;
	String country;
	String salary;
	
	public Player(String name, String team, String country, String salary) {
		super();
		this.name = name;
		this.team = team;
		this.country = country;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", team=" + team + ", country=" + country + ", salary=" + salary + "]";
	}
	
	

}

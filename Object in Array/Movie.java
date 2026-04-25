package storing_object;

public class Movie {

	String title;
	String director;
	String genre;
	public Movie(String title, String director, String genre) {
		super();
		this.title = title;
		this.director = director;
		this.genre = genre;
	}
	
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", director=" + director + ", genre=" + genre + "]";
	}


	public static void main(String[] args) {
		Movie m1=new Movie("kgf", "prasnant", "action");
		Movie m2=new Movie("hera pheri", "krishna", "comedy");
		Movie m3=new Movie("sanam teri kasam", "pretham", "romantic");
		Movie m4=new Movie("conjuring", "laxmi", "horror");
		Movie m5=new Movie("intersteller", "prasnant", "sci-fi");

		
		Movie[] movies= {m1,m2,m3,m4,};
		
		for(Movie m: movies) {
			System.out.println(m);
		}

	}
	
}

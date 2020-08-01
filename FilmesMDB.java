package streams;

public class FilmesMDB {
	
	private double imdb;
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	FilmesMDB(String name,double imdb) {
		super();
		this.imdb = imdb;
		this.name = name;
	}

	public double getImdb() {
		return imdb;
	}

	public void setImdb(double imdb) {
		this.imdb = imdb;
	}
}

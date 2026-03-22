package MusicLibrary;

public class Song extends Item {
	private Genre genre;

	  public Song(String name, Artist artist, Genre genre) {
	    super(name, artist);
	    this.genre = genre;
	  }

	  public String getString() {
	    return
	      getName() + ", " + getArtist().getString() + ", " + genre + "\n";
	  }

	  public Genre getGenre() {
	    return genre;
	  }

	  public void setGenre(Genre genre) {
	    this.genre = genre;
	  }

	  @Override
	  public String toString() {
	    String string = super.toString() + " ";
	    string += genre;
	    return string;
	  }
	}

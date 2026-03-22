package MusicLibrary;

public class Item {
		  private String name;
		  private Artist artist;

		  public Item(String name, Artist artist) {
		    this.name = name;
		    this.artist = artist;
		  }

		  public String getString() {
		    return name + ", " + artist.getString() + "\n";
		  }

		  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public Artist getArtist() {
		    return artist;
		  }

		  public void setArtist(Artist artist) {
		    this.artist = artist;
		  }

		  public String toString() {
		    return (name + " " + artist.getName());
		  }
		}
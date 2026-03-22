package MusicLibrary;
import java.util.ArrayList;

public class Album extends Item {
  private ArrayList<Song> songs = new ArrayList<>();

  public Album(String name, Artist artist) {
    super(name, artist);
  }

  public String getString() {
    String string = getName() + "\n";
    for (Song song : songs) {
      string += "  " + song.getString();
    }
    return string;
  }

  public ArrayList<Song> getSongs() {
    return songs;
  }

  public void add(Song song) {
    songs.add(song);
  }

  @Override
  public String toString() {
    String string = super.toString() + " ";
    for (Song song : songs) {
      string += song.toString() + " ";
      System.out.println(string);
    }
    return string;
  }
}
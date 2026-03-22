package Music;
import java.io.Serializable;

public class Artists implements Serializable{
	private String artistname, songtitle;
	public Artists()
	{
		songtitle=null;
		artistname=null;
	}
	public Artists(String artistname,String songtitle)
	{
		this.artistname=artistname;
		this.songtitle=songtitle;
	}
	@Override
	public String toString()
	{
		return "\nArtist Name: " + artistname + "\nSong Title: "+ songtitle + "\n";
	}
}

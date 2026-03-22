package Music;
import java.io.Serializable;

public class Songs implements Serializable {
	private String songtitle, albumname, artistname;
	public Songs()
	{
		songtitle=null;
		albumname=null;
		artistname=null;
	}
	public Songs(String songtitle,String albumname,String artistname)
	{
		this.songtitle=songtitle;
		this.albumname=albumname;
		this.artistname=artistname;
	}
	
	@Override
	public String toString()
	{
		return "\nSong Title: "+ songtitle + "\nAlbum Name: " + albumname + "\nArtish Name: " + artistname + "\n";
	}
	
	
	
}

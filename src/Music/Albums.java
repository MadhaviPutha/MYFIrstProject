package Music;
import java.io.Serializable;

public class Albums implements Serializable {
	private String albumname, artistname, songtitle;
	public Albums()
	{
		songtitle=null;
		albumname=null;
		artistname=null;
	}
	public Albums(String albumname,String artistname,String songtitle)
	{
		this.albumname=albumname;
		this.artistname=artistname;
		this.songtitle=songtitle;
	}
	
	@Override
	public String toString()
	{
		return "\nAlbum Name:" + albumname + "Song Title:"+ songtitle + "Artist Name:" + artistname;
	}
}

package Music;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
	private List<Albums> collection;
	private List<Artists> Artcollection;
	private List<Songs> Songcollection;

	public Library() {
		// List<Albums>collection = new ArrayList<Albums>(); // List the
		// interface and ArrrayList is the implementation
		collection = new ArrayList<Albums>();
		Artcollection = new ArrayList<Artists>();
		Songcollection = new ArrayList<Songs>();
	}

	public Boolean addAlbum(Albums album) {
		return collection.add(album);
	}
	public void addArtists(Artists artist) {
		Artcollection.add(artist);
	}
	public void addSongs(Songs song) {
		Songcollection.add(song);
	}
	@Override
	public String toString() {
		String total = "\n";
		for (int i = 0; i < collection.size(); i++) {
			Albums a = collection.get(i);
			total = total + a.toString();
		}
		return total;
	}
}

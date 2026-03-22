package MusicLibrary;

public class SongsAndAlbumsTest {

	  public static void main(String[] args) {
	    Artist john = new Artist("Elton John");
	    Item rocketMan = new Item("Rocket Man", john);

	    Artist bach = new Artist("J.S. Bach");
	    Song wellTemperedClavier = new Song("Well Tempered Clavier", bach, Genre.CLASSICAL);
	    bach.add(wellTemperedClavier);
	    Song tocataAndFugue = new Song("Tocata and Fugue", bach, Genre.CLASSICAL);
	    bach.add(tocataAndFugue);

	    Artist joel = new Artist("Billy Joel");
	    Song movinOut = new Song("Movin' Out", joel, Genre.POP);
	    joel.add(movinOut);
	    Song justTheWayYouAre = new Song("Just the Way You Are", joel, Genre.POP);
	    joel.add(justTheWayYouAre);

	    Album stranger = new Album("The Stranger", joel);
	    stranger.add(movinOut);
	    stranger.add(justTheWayYouAre);
	    joel.add(stranger);

	    Playlist playlist = new Playlist();
	    playlist.addItem(stranger);
	    playlist.addItem(rocketMan);
	    playlist.addItem(wellTemperedClavier);
	    playlist.addItem(tocataAndFugue);

	    System.out.println(playlist.getString());
	  }
	}
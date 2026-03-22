package MusicLibrary;

import java.util.ArrayList;

// program to View a list of all the artists in the library (view, return, set)  
public class Artist {
	  private String name;
	  private ArrayList<Item> items = new ArrayList<>();   // declared empty array list of type Item

	  public Artist(String name) {
	    super();
	    this.name = name;			// Assigning local variable value to instance variable
	  }

	  public String getString() {
	    return name;				// return the name of the artist
	  }

	  public String getName() {
	    return name;				// return the name of the artist
	  }

	  public void setName(String name) {
	    this.name = name;			// set the name of the artist
	  }

	  public ArrayList<Item> getItems() {
	    return items;				// return the list of items
	  }

	  public void add(Item item) {
	    items.add(item);			// add items to the array list  
	  }
	}

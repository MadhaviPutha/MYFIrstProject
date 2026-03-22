package MusicLibrary;

import java.util.ArrayList;

public class Playlist {
  private ArrayList<Item> items = new ArrayList<>();

  public String getString() {
    String string = "";
    for (Item item : items) {
      string += item.getString();
    }
    return string;
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public ArrayList<Item> getItems() {
    return items;
  }

  public void setItems(ArrayList<Item> items) {
    this.items = items;
  }
}
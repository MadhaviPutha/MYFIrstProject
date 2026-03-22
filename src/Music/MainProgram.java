package Music;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainProgram {

	static String fileName = null;
	static Library lib = new Library();
	static Scanner input = new Scanner(System.in);
	static boolean var1 = true;

	public static void main(String[] args) {

		while (var1) {
			System.out.println("\n Enter 0 for view the library." + "\n Enter 1 for save and exit."
					+ "\n Enter 2 to view all the albums in the library." + "\n Enter 3 to add albums in the library."
					+ "\n Enter 4 to edit albums in the library." + "\n Enter 4 to edit albums in the library."
					+ "\n Enter 5 to add songs in an album." + "\n Enter 6 to edit songs in an album."
					+ "\n Enter 7 to remove songs in an album." + "\n Enter 8 to remove songs in an library."
					+ "\n Enter 9 to add artist to the song." + "\n Enter 10 to edit artist to the song."
					+ "\n Enter 11 to remove artist to the song.");
			int output = input.nextInt();
			switch (output) {
			case 0:
				System.out.println("Enter the file name to load the library");
				fileName = input.next();
				loadFile(fileName);
				break;
			case 1:
				saveAndQuit();
				break;
			case 2:
				System.out.println(lib.toString());
				break;
			case 3:
				addAlbums();
				break;
			case 4: // edit albums
				break;
			case 5:
				addSongs();
				break;
			case 6: // edit songs in an album.
				break;
			case 7: // remove songs in album
				break;
			case 8: // remove songs in an library
				break;
			case 9:
				addArtists();
				break;
			case 10: // edit artist to the song
				break;
			case 11: // remove artist to the song
				break;
			}
		}

		System.exit(0);
	}

	private static void addArtists() {
		String artistname, songtitle;
		System.out.println("\nEnter the name of the Artist: ");
		artistname = input.next();
		System.out.println("\nEnter the title of the Song: ");
		songtitle = input.next();
		Artists aa = new Artists(artistname, songtitle);
		lib.addArtists(aa);
	}

	private static void addSongs() {
		String songtitle, albumname, artistname;
		System.out.println("\nEnter the title of the Song: ");
		songtitle = input.next();
		System.out.println("\nEnter the name of the Album: ");
		albumname = input.next();
		System.out.println("\nEnter the name of the Artist: ");
		artistname = input.next();
		Songs s = new Songs(songtitle, albumname, artistname);
		lib.addSongs(s);
	}

	private static void addAlbums() {
		String albumname, artistname, songtitle;
		System.out.println("\nEnter the title of the Album: ");
		albumname = input.next();
		System.out.println("\nEnter the name of the Artist: ");
		artistname = input.next();
		System.out.println("\nEnter the title of the Song: ");
		songtitle = input.next();
		Albums a = new Albums(albumname, artistname, songtitle);
		lib.addAlbum(a);
	}

	private static void saveAndQuit() {
		System.out.println("Enter file name: ");
		fileName = input.next() + ".txt";
		var1 = false;
		FileOutputStream fos = null;
		ObjectOutputStream out = null;
		try {
			fos = new FileOutputStream(fileName);
			out = new ObjectOutputStream(fos);
			out.writeObject(lib);
			fos.close();
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*public static void write(String s, File f) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		fw.write(s);
		fw.close();
	}*/
	public static void write(String s, File f) throws IOException {
        if(!f.exists()) {
           f.createNewFile();
        }
		
		try {
            FileWriter writer = new FileWriter(f, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
 
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.write(s);
 
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	

	private static void loadFile(String name) {
		FileInputStream fis = null;
		ObjectInputStream input = null;

		File file = new File(name + ".txt");
		if (file.exists()) {
			try {
				fis = new FileInputStream(file);
				input = new ObjectInputStream(fis);
				lib = (Library) input.readObject();
				fis.close();
				input.close();

			} catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("\nThe file doest not exists.");
		}
	}
}
package Pack1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {

		try {
			// Creation of the File
			File myObj = new File("abc.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists");
				
				// Writing to the File
				FileWriter myWriter = new FileWriter("abc.txt");
				myWriter.write("Files in Java might be tricky, but it is fun enough.");
				myWriter.close();
				System.out.println("successfully wrote to the File");
			}
		} catch (IOException e) {
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
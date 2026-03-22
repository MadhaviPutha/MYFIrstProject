package Pack2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class TextFileWritingExample2 {

	public static void main(String[] args) {
		      try {
		         String data = " my head";
		         File f1 = new File("D:\\abc.txt");
		         if(!f1.exists()) {
		            f1.createNewFile();
		         }

		         FileWriter fileWritter = new FileWriter(f1.getName(),true);
		         BufferedWriter bw = new BufferedWriter(fileWritter);
		         bw.write(data);
		         bw.close();
		         System.out.println("Done");
		      } catch(IOException e){
		         e.printStackTrace();
		      }
		   }
		}

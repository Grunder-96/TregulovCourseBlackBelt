package work_with_files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyEx {
	
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
			BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))) {
			
			String string;
			while ((string = reader.readLine()) != null) {
				writer.write(string);
				writer.write("\n");
			}
//			int character;
//			while ((character = reader.read()) != -1) {
//				writer.write(character);
//			}
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

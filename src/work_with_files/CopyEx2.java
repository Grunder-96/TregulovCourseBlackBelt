package work_with_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx2 {
	
	public static void main(String[] args) {
		try (FileInputStream inputStream = new FileInputStream("java1.jpg");
			 FileOutputStream outputStream  = new FileOutputStream("java2.jpg")) {
			
			int i;
			while ((i = inputStream.read()) != -1) {
				outputStream.write(i);
			}
			System.out.println("Done!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

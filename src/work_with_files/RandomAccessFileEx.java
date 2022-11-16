package work_with_files;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	
	public static void main(String[] args) {
		try(RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {
			int a = file.read();
			System.out.println((char) a);
			int b = file.read();
			System.out.println((char) b);
			String s1 = file.readLine();
			System.out.println(s1);
			
			file.seek(101);
			System.out.println(file.readLine());
			System.out.println(file.getFilePointer());
			
//			file.seek(0);
//			file.writeBytes("privet");
			file.seek(file.length() - 1);
			file.writeBytes("\n\t\t\t\t\tWilliam Batler Yeats");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

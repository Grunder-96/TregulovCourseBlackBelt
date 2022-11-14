package work_with_files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileEx {
	
	public static void main(String[] args) throws IOException{
		File file = new File("test10.txt");
		File folder = new File("C:\\Users\\gvt\\Desktop\\A");
		File file2 = new File("C:\\Users\\gvt\\Desktop\\desktop\\test20.txt");
		File folder2 = new File("C:\\Users\\gvt\\Desktop\\desktop");
		System.out.println("file: " + file.getAbsolutePath());
		System.out.println("directory: " + folder.getAbsolutePath());
		System.out.println("--------------------------------------");
		
		System.out.println("file: " + file.isAbsolute());
		System.out.println("directory: " + folder.isAbsolute());
		System.out.println("--------------------------------------");
		
		System.out.println("file: " + file.isDirectory());
		System.out.println("directory: " + folder.isDirectory());
		System.out.println("--------------------------------------");
		
		System.out.println("file: " + file.exists());
		System.out.println("directory: " + folder.exists());
		System.out.println("file2: " + file2.exists());
		System.out.println("directory2: " + folder2.exists());
		System.out.println("--------------------------------------");
		
		System.out.println("directory2: " + folder2.mkdir());
		System.out.println("file2: " + file2.createNewFile());
		System.out.println("--------------------------------------");
		
		System.out.println("file2: " + file2.delete());
		System.out.println("directory2: " + folder2.delete());
		System.out.println("--------------------------------------");
		
		File[] files = folder.listFiles();
		System.out.println(Arrays.toString(files));
		System.out.println("--------------------------------------");
		
		System.out.println("file2: " + file2.isHidden());
		System.out.println("file2: " + folder2.canRead());
		System.out.println("file2: " + folder2.canWrite());
		System.out.println("file2: " + folder2.canExecute());
		System.out.println("--------------------------------------");
	}
}

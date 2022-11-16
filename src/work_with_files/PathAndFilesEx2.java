package work_with_files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathAndFilesEx2 {

	public static void main(String[] args) throws IOException {
		Path filePath = Paths.get("test15.txt");
		Path directoryPath = Paths.get("C:\\Users\\gvt\\Desktop\\A");
		Path directoryPath1 = Paths.get("C:\\Users\\gvt\\Desktop\\B");
		
//		Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
//		Files.copy(filePath, directoryPath.resolve("test16.txt"));
//		Files.copy(directoryPath1, directoryPath.resolve("B"));
		
//		Files.move(filePath, directoryPath.resolve("test15.txt"));
//		Files.move(Paths.get("test10.txt"), filePath);
		
//		Files.delete(Paths.get("test133.txt"));
		Files.delete(directoryPath);
		
		System.out.println("Done!");	
	}
}

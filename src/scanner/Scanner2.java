package scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Scanner2 {
	
	public static void main(String[] args) {
		Scanner scanner = null;
		Set<String> treeSet = new TreeSet<>();
		
		try {
			scanner = new Scanner(new FileReader(new File("C:\\Users\\gvt\\Desktop\\text.txt")));
			scanner.useDelimiter("\\W");
			while (scanner.hasNext()) {
				treeSet.add(scanner.next());
			}
			for (String word : treeSet) {
				System.out.println(word);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}

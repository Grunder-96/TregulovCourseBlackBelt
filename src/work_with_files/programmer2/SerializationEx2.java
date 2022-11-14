package work_with_files.programmer2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import work_with_files.programmer1.Employee;

public class SerializationEx2 {
	
	public static void main(String[] args) {
		Employee employee;
		try(ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees2.bin"))) {
			employee = (Employee) inputStream.readObject();
			System.out.println(employee);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

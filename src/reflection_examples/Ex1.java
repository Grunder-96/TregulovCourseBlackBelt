package reflection_examples;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Ex1 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		Class employeeClass = Class.forName("reflection_examples.Employee");
//		Class employeeClass2 = Employee.class;
//		Employee emp = new Employee();
//		Class employeeClass3 = emp.getClass();
		
		Field someField = employeeClass.getField("id");
		System.out.println("Type of id field = " + someField.getType());
		System.out.println("*********");
		Field[] arrayFields = employeeClass.getFields();
		for (Field field : arrayFields) {
			System.out.println("Type of " + field.getName() + " field = " + field.getType());
		}
		System.out.println("*********");
		Field[] allFields = employeeClass.getDeclaredFields();
		for (Field field : allFields) {
			System.out.println("Type of " + field.getName() + " field = " + field.getType());
		}
		System.out.println("*********");
	}
}

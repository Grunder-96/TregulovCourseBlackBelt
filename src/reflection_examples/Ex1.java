package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Ex1 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
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
		Method someMethod1 = employeeClass.getMethod("increaseSalary");
		System.out.println("Return type of method increaseSalary = " + someMethod1.getReturnType() + 
		", parameter types: " + Arrays.toString(someMethod1.getParameterTypes()));
		System.out.println("*********");
		Method someMethod2 = employeeClass.getMethod("setSalary", double.class);
		System.out.println("Return type of method setSalary = " + someMethod2.getReturnType() + 
		", parameter types: " + Arrays.toString(someMethod2.getParameterTypes()));
		System.out.println("*********");
		Method[] arrayMethods = employeeClass.getMethods();
		for (Method method : arrayMethods) {
			System.out.println("Return type of method " + method.getName() + " = " + method.getReturnType() + 
			", parameter types: " + Arrays.toString(method.getParameterTypes()));
		}
		System.out.println("*********");
		Method[] AllMethods = employeeClass.getDeclaredMethods();
		for (Method method : AllMethods) {
			System.out.println("Return type of method " + method.getName() + " = " + method.getReturnType() + 
			", parameter types: " + Arrays.toString(method.getParameterTypes()));
		}
		System.out.println("*********");
		Method[] AllMethods2 = employeeClass.getDeclaredMethods();
		for (Method method : AllMethods) {
			if (Modifier.isPublic(method.getModifiers())) {
				System.out.println("Return type of method " + method.getName() + " = " + method.getReturnType() + 
				", parameter types: " + Arrays.toString(method.getParameterTypes()));
			}
		}
		System.out.println("*********");
		Constructor constructor1 = employeeClass.getConstructor();
		System.out.println("Constructor has " + constructor1.getParameterCount() + " parameters,"
		+ " their types is " + Arrays.toString(constructor1.getParameterTypes()));
		System.out.println("*********");
		Constructor constructor2 = employeeClass.getConstructor(int.class, String.class, String.class, double.class);
		System.out.println("Constructor has " + constructor2.getParameterCount() + " parameters,"
		+ " their types is " + Arrays.toString(constructor2.getParameterTypes()));
		System.out.println("*********");
		Constructor[] constructors = employeeClass.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Constructor " + constructor.getName() + " has " + constructor.getParameterCount() + " parameters,"
			+ " their types is " + Arrays.toString(constructor2.getParameterTypes()));
		}
	}
}

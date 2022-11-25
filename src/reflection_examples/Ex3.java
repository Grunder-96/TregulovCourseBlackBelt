package reflection_examples;

import java.lang.reflect.Field;

public class Ex3 {
	
	public static void main(String[] args) throws ClassNotFoundException
		, NoSuchFieldException, SecurityException
		, IllegalArgumentException, IllegalAccessException {
		Employee emp = new Employee(225, "Gennadiy", "IT");
		Class empClass = emp.getClass();
		Field field = empClass.getDeclaredField("salary");
		field.setAccessible(true);
		double salaryValue = field.getDouble(emp);
		System.out.println(salaryValue);
		field.set(emp, 135000);
		System.out.println(emp);
	}
}

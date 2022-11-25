package reflection_examples;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
	
	public static void main(String[] args) throws ClassNotFoundException
		, InstantiationException, IllegalAccessException
		, NoSuchMethodException, SecurityException
		, IllegalArgumentException, InvocationTargetException {
		Class empClass = Class.forName("reflection_examples.Employee");
		
//		Object object = empClass.newInstance();
//		Employee o = (Employee) object;
//		System.out.println(o);
		
		Constructor<Employee> constructor = empClass.getConstructor();
		Employee object1 = constructor.newInstance();
		
		Constructor constructor2 = empClass.getConstructor(int.class, String.class, String.class);
		Object object2 = constructor2.newInstance(1, "John", "IT");
		System.out.println(object2);
		Method method = empClass.getMethod("setSalary", double.class);
		method.invoke(object2, 150000);
		System.out.println(object2);
	}
}

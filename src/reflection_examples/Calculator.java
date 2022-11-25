package reflection_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calculator {
	
	void sum(int a, int b) {
		int result = a + b;
		System.out.println("sum of " + a  + " and " + b + " = " + result);
	}
	
	void subtraction(int a, int b) {
		int result = a - b;
		System.out.println("subtraction of " + a  + " and " + b + " = " + result);
	}
	
	void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("multiplication of" + a  + " and " + b + " = " + result);
	}
	
	void division(int a, int b) {
		int result = a / b;
		System.out.println("division of " + a  + " and " + b + " = " + result);
	}
}

class TestCalculator {
	
	public static void main(String[] args) {
		try (BufferedReader breader = new BufferedReader(new FileReader("test100.txt"))) {
			String methodName = breader.readLine();
			String firstArgument = breader.readLine();
			String secondArgument = breader.readLine();
			
			Calculator calculator = new Calculator();
			Class cl = calculator.getClass();
			Method method = null;
			Method[] methods = cl.getDeclaredMethods();
			for (Method varMethod : methods) {
				if (varMethod.getName().equals(methodName)) {
					method = varMethod;
				}
			}
			method.invoke(calculator, Integer.parseInt(firstArgument), Integer.parseInt(secondArgument));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

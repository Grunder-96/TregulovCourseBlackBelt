package regex;

public class PrintfExample {
	
	static void employeeInfo(Employee employee) {
		System.out.printf("%03d\t %-12s %-12s %,.1f\n", employee.id, employee.name, employee.surname, employee.salary * (1 + employee.bonusPct));
	}
	
	public static void main(String[] args) {
		employeeInfo(new Employee(1, "Grigory", "Taran", 1250000, 0.15));
		employeeInfo(new Employee(2, "Ivan", "Petrov", 6542, 0.08));
		employeeInfo(new Employee(3, "Mariya", "Ivanova", 8543, 0.12));
		
		String newString = String.format("%03d\t %-12s %-12s %,.1f\n", 1, "Grigory", "Taran", 1250000 * (1 + 0.15));
		System.out.println("newString: " + newString);
	}
}

class Employee {
	int id;
	String name;
	String surname;
	int salary;
	double bonusPct;
	
	public Employee(int id, String name, String surname, int salary, double bonusPct) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.bonusPct = bonusPct;
	}
	
	
}

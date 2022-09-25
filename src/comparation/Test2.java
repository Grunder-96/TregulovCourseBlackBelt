package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		Employee employee1 = new Employee(25, "Grigory", 45000);
		Employee employee2 = new Employee(125, "Anna", 37000);
		Employee employee3 = new Employee(43, "Egor", 62000);
		Employee employee4 = new Employee(27, "Tom", 35000);
		Employee employee5 = new Employee(67, "Anton", 17000);
		Employee employee6 = new Employee(17, "Anatoliy", 15000);
		Employee employee7 = new Employee(17, "Anatoliy", 18000);
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);
		list.add(employee5);
		list.add(employee6);
		list.add(employee7);
		
		System.out.println(list);
		
		Collections.sort(list, new SalaryComparator()/*(v1, v2) -> Integer.valueOf(v1.getId()).compareTo(Integer.valueOf(v2.getId()))*/);
		
		System.out.println(list);
	}
}

class Employee /*implements Comparable<Employee>*/{

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]\n";
	}
	
//	@Override
//	public int compareTo(Employee e2) {
////		return -(this.getId() - e2.getId());
//		int res = this.getName().compareTo(e2.getName());
//		if (res == 0) {
//			res = -(this.getSalary() - e2.getSalary());
//		}
//		return res;
//	}

}

class IdComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getId() - e2.getId();
	}
	
}

class NameComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
	
}

class SalaryComparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSalary() - e2.getSalary();
	}
	
}

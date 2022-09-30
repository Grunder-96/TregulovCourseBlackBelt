package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BinarySearch {
	
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<>();
		aList.add(-3);
		aList.add(8);
		aList.add(12);
		aList.add(-8);
		aList.add(0);
		aList.add(5);
		aList.add(10);
		aList.add(1);
		aList.add(150);
		aList.add(-30);
		aList.add(19);
		
//		Collections.sort(aList);
//		System.out.println(aList);
////	Collections.reverse(aList);
////	System.out.println(aList);
////	Collections.shuffle(aList);
////	System.out.println(aList);		
//		int index = Collections.binarySearch(aList, 12);
//		System.out.println(index);
		
//		Employee emp1 = new Employee(100, "Zaur", 12345);
//		Employee emp2 = new Employee(15, "Ivan", 6542);
//		Employee emp3 = new Employee(123, "Petr", 8542);
//		Employee emp4 = new Employee(15, "Mariya", 5678);
//		Employee emp5 = new Employee(182, "Kolya", 125);
//		Employee emp6 = new Employee(15, "Sasha", 9874);
//		Employee emp7 = new Employee(250, "Elena", 1579);
//		
//		List<Employee> list = new ArrayList<>();
//		list.add(emp1);
//		list.add(emp2);
//		list.add(emp3);
//		list.add(emp4);
//		list.add(emp5);
//		list.add(emp6);
//		list.add(emp7);
//		
//		System.out.println(list);
//		Collections.sort(list);
//		System.out.println(list);
//		
//		int index = Collections.binarySearch(list, new Employee(182, "Kolya", 0));
//		System.out.println(index);
		
//		int[] array = {-3 , 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//		System.out.println(Arrays.toString(array));
//		Arrays.sort(array);
//		System.out.println(Arrays.toString(array));
//		int index = Arrays.binarySearch(array, 150);
//		System.out.println(index);
		
	}
}

class Employee implements Comparable<Employee>{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name, salary);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	@Override
	public int compareTo(Employee another ) {
		if (this.id == another.id) {
			return this.name.compareTo(another.name);
		}
		return this.id - another.id;
	}
}

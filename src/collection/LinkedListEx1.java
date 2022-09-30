package collection;

import java.util.LinkedList;
import java.util.Objects;

public class LinkedListEx1 {
	
	public static void main(String[] args) {
		Student2 st1 = new Student2("Ivan", 3);
		Student2 st2 = new Student2("Nikolay", 2);
		Student2 st3 = new Student2("Elena", 1);
		Student2 st4 = new Student2("Petr", 4);
		Student2 st5 = new Student2("Mariya", 3);
		
		LinkedList<Student2> studentLL = new LinkedList<>();
		studentLL.add(st1);
		studentLL.add(st2);
		studentLL.add(st3);
		studentLL.add(st4);
		studentLL.add(st5);
		
		System.out.println(studentLL);
		
		Student2 st6 = new Student2("Zaur", 3);
		Student2 st7 = new Student2("Igor", 4);
		
		studentLL.add(st6);
		
		
		studentLL.add(1, st7);
		System.out.println(studentLL);
		
		studentLL.remove(st3);
		System.out.println(studentLL);
	}
}

class Student2 {
	
	String name;
	int course;
	
	public Student2(String name, int course) {
		this.name = name;
		this.course = course;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(course, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		return course == other.course && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student2 [name=" + name + ", course=" + course + "]";
	}
	
}

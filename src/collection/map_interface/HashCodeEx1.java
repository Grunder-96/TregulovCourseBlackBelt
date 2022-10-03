package collection.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
	
	public static void main(String[] args) {
		Map<Student, Double> map = new HashMap<>();
		Student st1 = new Student("Zaur", "Tregulov", 3);
		Student st2 = new Student("Mariya", "Ivanova", 1);
		Student st3 = new Student("Sergey", "Petrov", 4);
		
		map.put(st1, 7.5);
		map.put(st2, 8.7);
		map.put(st3, 9.2);
		
		Student st4 = new Student("Zaur", "Tregulov", 3);
		Student st5 = new Student("Igor", "Sidorov", 4);
//		boolean result = map.containsKey(st4);
//		System.out.println(result);
//		System.out.println(st1.equals(st4));
		
		System.out.println(st1.hashCode());
		System.out.println(st5.hashCode());
		
		System.out.println(map);
		
		for (Map.Entry<Student, Double> entry : map.entrySet()) {
			System.out.println(entry);
		}
	}
}

class Student {
	
	String name;
	String surname;
	int course;
	
	public Student(String name, String surname, int course) {
		this.name = name;
		this.surname = surname;
		this.course = course;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, name, surname);
//		return name.length() * 7 + surname.length() * 11 + course * 53;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
	}
}
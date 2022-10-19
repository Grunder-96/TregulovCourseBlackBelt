package stream;

import java.util.ArrayList;
import java.util.List;

public class Test7 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		Student st1 = new Student("Alfred", 'm', 27, 3, 4.5);
		Student st2 = new Student("Anna", 'f', 18, 1, 3.9);
		Student st3 = new Student("Jack", 'm', 24, 5, 4.8);
		Student st4 = new Student("Elena", 'f', 24, 2, 3.1);
		Student st5 = new Student("Mike", 'm', 38, 5, 5.0);
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		students.add(st5);
		
		Faculty faculty1 = new Faculty("Economics");
		Faculty faculty2 = new Faculty("Applied mathematics");
		
		faculty1.addStidentOnFacaulty(st1);
		faculty1.addStidentOnFacaulty(st2);
		faculty1.addStidentOnFacaulty(st3);
		faculty2.addStidentOnFacaulty(st4);
		faculty2.addStidentOnFacaulty(st5);
		
		List<Faculty> facultyList = new ArrayList<>();
		facultyList.add(faculty1);
		facultyList.add(faculty2);
		
		facultyList.stream()
			.flatMap(faculty -> faculty
					.getStudentsOnFaculty()
					.stream())
					.forEach(e -> System.out.println(e.getName()));
	}
}

class Faculty {
	
	String name;
	List<Student> studentsOnFaculty;
	
	public Faculty(String name) {
		this.name = name;
		studentsOnFaculty = new ArrayList<>();
	}
	
	public List<Student> getStudentsOnFaculty() {
		return studentsOnFaculty;
	}
	
	public void addStidentOnFacaulty(Student student) {
		studentsOnFaculty.add(student);
	}
}

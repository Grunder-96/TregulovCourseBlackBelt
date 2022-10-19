package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Test8 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		Student st1 = new Student("Alfred", 'm', 27, 3, 4.5);
		Student st2 = new Student("Anna", 'f', 18, 1, 3.9);
		Student st3 = new Student("Jack", 'm', 24, 3, 4.8);
		Student st4 = new Student("Elena", 'f', 24, 2, 3.1);
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		Map<Integer, List<Student>> map = students.stream().map(student -> {
			student.setName(student.getName().toUpperCase());
			return student;
		})
		.collect(Collectors.groupingBy(e -> e.getCourse()));
		for (Entry<Integer, List<Student>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
//		Map<Boolean, List<Student>> map = students.stream().map(student -> {
//			student.setName(student.getName().toUpperCase());
//			return student;
//		})
//		.collect(Collectors.partitioningBy(e -> e.getAverageGrade() > 3.5));
//		for (Entry<Boolean, List<Student>> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
	}
}

package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		Student st1 = new Student("Alfred", 'm', 27, 3, 4.5);
		Student st2 = new Student("Anna", 'f', 18, 1, 3.9);
		Student st3 = new Student("Jack", 'm', 24, 5, 4.8);
		Student st4 = new Student("Elena", 'f', 24, 2, 3.1);
		
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		Student smallest = students.stream().min((a, b) -> a.getAge() - b.getAge()).get();
		System.out.println(smallest);
		
		Student biggest = students.stream().max((a, b) -> a.getAge() - b.getAge()).get();
		System.out.println(biggest);
		
		Student[] arrayLimit = students.stream().sorted((a, b) -> a.getAge() - b.getAge()).limit(2).toArray(Student[]::new);
		System.out.println(Arrays.toString(arrayLimit));
		
		Student[] arraySkip = students.stream().skip(1).toArray(Student[]::new);
		System.out.println(Arrays.toString(arraySkip));
		
		List<Integer> listMTI = students.stream().mapToInt(e -> e.getCourse()).boxed().collect(Collectors.toList());
		System.out.println(listMTI);
		
		int sum = students.stream().mapToInt(a -> a.getCourse()).sum();
		System.out.println(sum);
		
		double average = students.stream().mapToInt(a -> a.getCourse()).average().getAsDouble();
		System.out.println(average);
		
		int min = students.stream().mapToInt(a -> a.getCourse()).min().getAsInt();
		System.out.println(min);
		
		int max = students.stream().mapToInt(a -> a.getCourse()).max().getAsInt();
		System.out.println(max);
	}
}

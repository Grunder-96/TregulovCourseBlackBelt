package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Test2 {
	
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
		
//		students.stream()
//		.map(stud -> {
//			stud.setName(stud.getName().toUpperCase());
//			return stud;
//		})
//		.filter(stud -> stud.getSex() == 'f')
//		.sorted((stud, stud2) -> stud.getAge() - stud2.getAge())
//		.forEach(System.out::println);
		
		Student first = students.stream()
			.map(stud -> {
				stud.setName(stud.getName().toUpperCase());
				return stud;
			})
			.filter(stud -> stud.getSex() == 'f')
			.sorted((stud, stud2) -> stud.getAge() - stud2.getAge())
			.findFirst().get();
		System.out.println(first);
		
		System.out.println(students.stream().filter(st -> st.getAge() > 22 
				&& st.getAverageGrade() > 4.5).collect(Collectors.toList()));
		
		Stream<Student> stream = Stream.of(st1, st2, st3, st4);
		stream.filter(a -> a.getCourse() > 2).collect(Collectors.toList());
		
		List<Student> sortedList = students.stream()
			.sorted((a, b) -> a.getName().compareTo(b.getName()))
			.collect(Collectors.toList());
		System.out.println(".sorted(): " + sortedList);
	}
}

class Student {

	private String name;
	private char sex;
	private int age;
	private int course;
	private double averageGrade;

	public Student(String name, char sex, int age, int course, double averageGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.averageGrade = averageGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", averageGrade="
				+ averageGrade + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}
}
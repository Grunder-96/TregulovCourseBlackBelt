package lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentInfo {
	
	void testStudents(ArrayList<Student> list, Predicate<Student> sc/*StudentChecks sc*/) {
		for (Student s : list) {
			if (sc.test(s)) {
				System.out.println(s);
			}
		}
	}
	
//	public void printStudentOverGrade(ArrayList<Student> list, double grade) {
//		for (Student s : list) {
//			if (s.averageGrade > grade) {
//				System.out.println(s);
//			}
//		}
//		System.out.println();
//	}
//		
//	public void printStudentUnderAge(ArrayList<Student> list, int age) {
//		for (Student s : list) {
//			if (s.age < age) {
//				System.out.println(s);
//			}
//		}
//		System.out.println();
//	}
//	
//	public void printStudentMixCondition(ArrayList<Student> list, int age, double grade, char sex) {
//		for (Student s : list) {
//			if (s.age > age && s.averageGrade < grade && s.sex == sex) {
//				System.out.println(s);
//			}
//		}
//		System.out.println();
//	}
}

class Test {
	
	public static void main(String[] args) {
		Student st1 = new Student("Alfred", 'm', 27, 3, 4.5);
		Student st2 = new Student("Anna", 'f', 18, 1, 3.9);
		Student st3 = new Student("Jack", 'm', 24, 5, 4.8);
		Student st4 = new Student("Elena", 'f', 24, 2, 3.1);
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(st1);
		students.add(st2);
		students.add(st3);
		students.add(st4);
		
		StudentInfo info = new StudentInfo();
		
		Predicate<Student> check1 = student -> student.sex == 'm';
		Predicate<Student> check2 = student -> student.age > 24;
		info.testStudents(students, check1.negate());
		
//		info.testStudents(students, new CheckOverGrade());
//		info.testStudents(students, new StudentChecks() {
//			@Override
//			public boolean check(Student s) {
//				return s.age < 22;
//			}
//		});
		
//		info.testStudents(students, (Student s) -> {return s.age < 25;});
//		System.out.println();
//		info.testStudents(students, s -> s.averageGrade > 4.2);
//		System.out.println();
//		info.testStudents(students, s -> s.sex == 'f' && s.course > 1 && s.age < 25);
//		
//		System.out.print("-------------------------------------\n");
//		Predicate<Student> sc = s -> s.sex == 'f';
//		info.testStudents(students, sc);
		
//		info.printStudentOverGrade(students, 4);
//		info.printStudentUnderAge(students, 25);
//		info.printStudentMixCondition(students, 20, 4, 'f');
	}
}

//@FunctionalInterface
//interface StudentChecks {
//	boolean check(Student s);
//}

class CheckOverGrade  implements Predicate<Student>/*StudentChecks*/{

	@Override
	public boolean test(Student s) {
		return s.averageGrade > 4.6;
	}
	
}

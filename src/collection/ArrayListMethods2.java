package collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethods2 {

	public static void main(String[] args) {
		
		Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
		Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
		Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
		Student st4 = new Student("Petr", 'm', 35, 4, 7);
		Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);
		
		Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		//Удалится в том случае, если в Student переопределен equals()
		list.remove(st6);
		
		System.out.println(list);

	}

}

class Student {

	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade="
				+ avgGrade + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, avgGrade, course, name, sex);
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
		return age == other.age && Double.doubleToLongBits(avgGrade) == Double.doubleToLongBits(other.avgGrade)
				&& course == other.course && Objects.equals(name, other.name) && sex == other.sex;
	}
	
}

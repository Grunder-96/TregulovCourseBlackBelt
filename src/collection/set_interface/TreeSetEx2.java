package collection.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {

	public static void main(String[] args) {

		TreeSet<Student> treeSet = new TreeSet<>();

		Student st1 = new Student("Zaur", 5);
		Student st2 = new Student("Misha", 1);
		Student st3 = new Student("Egor", 2);
		Student st4 = new Student("Marina", 3);
		Student st5 = new Student("Olya", 4);

		treeSet.add(st1);
		treeSet.add(st2);
		treeSet.add(st3);
		treeSet.add(st4);
		treeSet.add(st5);

		System.out.println(treeSet);
		
		Student st6 = new Student("Oleg", 3);
		
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		System.out.println(treeSet.headSet(st6));
		System.out.println(treeSet.tailSet(st6));
		System.out.println(treeSet.subSet(st2, st5));
		System.out.println("\n" + st4.equals(st6));
		System.out.println(st4.hashCode() == st6.hashCode());
	}
}

class Student implements Comparable<Student> {

	String name;
	int course;

	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}

	@Override
	public int compareTo(Student another) {
		return this.course - another.course;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(course);
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
		return course == other.course;
	}

}

package lambda;

public class Student {

	String name;
	char sex;
	int age;
	int course;
	double averageGrade;

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

}

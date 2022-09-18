package generics.game;

public class Test {
	
	public static void main(String[] args) {
		
		Schoolar schoolar1 = new Schoolar("Alex", 13);
		Schoolar schoolar2 = new Schoolar("Alice", 11);
		Schoolar schoolar3 = new Schoolar("Michael", 12);
		Schoolar schoolar4 = new Schoolar("Ann", 15);
		
		Student student1= new Student("Jack", 19);
		Student student2 = new Student("Yulia", 22);
		
		Employee employee1= new Employee("Daniel", 35);
		Employee employee2 = new Employee("Mike", 43);
		
		Team<Schoolar> schoolarTeam = new Team<>("Schoolars");
		schoolarTeam.addNewParticipant(schoolar1);
		schoolarTeam.addNewParticipant(schoolar2);
		System.out.print("\n");
		
		Team<Schoolar> schoolarTeam2 = new Team<>("Schoolars2");
		schoolarTeam.addNewParticipant(schoolar3);
		schoolarTeam.addNewParticipant(schoolar4);
		System.out.print("\n");
		
		Team<Student> studentTeam = new Team<>("Students");
		studentTeam.addNewParticipant(student1);
		studentTeam.addNewParticipant(student2);
		System.out.print("\n");
		
		Team<Employee> employeeTeam = new Team<>("Employees");
		employeeTeam.addNewParticipant(employee1);
		employeeTeam.addNewParticipant(employee2);
		System.out.print("\n");
		
		schoolarTeam.playWith(schoolarTeam2);
	}
}

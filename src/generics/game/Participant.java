package generics.game;

public abstract class Participant {
	
	private String name;
	private int age;
	
	public Participant(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
}

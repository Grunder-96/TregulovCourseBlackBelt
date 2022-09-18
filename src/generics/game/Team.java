package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant>{
	private String name;
	private List<T> list = new ArrayList<>();

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addNewParticipant(T participant) {
		list.add(participant);
		System.out.println("Participant " + participant.getName() + " successfully added in team " + name);
	}

	public void playWith(Team<T> anotherTeam) {
		Random random = new Random();
		int i = random.nextInt(2);
		if (i == 0) {
			System.out.println("Team " + name + " - winner");
		} else {
			System.out.println("Team " + anotherTeam.getName() + " - winner");
		}
	}

}
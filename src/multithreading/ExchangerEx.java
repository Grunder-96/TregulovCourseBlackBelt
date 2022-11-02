package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
	
	public static void main(String[] args) {
		Exchanger<Action> exchanger = new Exchanger<>();
		
		List<Action> list1 = List.of(Action.BUMAGA, Action.NOZHNICI, Action.KAMEN);
		List<Action> list2 = List.of(Action.KAMEN, Action.KAMEN, Action.KAMEN);
		
		BestFriend friend1 = new BestFriend("Zaur", list1, exchanger);
		BestFriend friend2 = new BestFriend("Nikolay", list2, exchanger);
		
		friend1.start();
		friend2.start();
	}
}

enum Action {
	KAMEN, NOZHNICI, BUMAGA;
}

class BestFriend extends Thread {
	
	private String name;
	private List<Action> myActions = new ArrayList<>();
	private Exchanger<Action> exchanger;
	
	public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
		super();
		this.name = name;
		this.myActions = myActions;
		this.exchanger = exchanger;
	}
	
	private void whoWins(Action myAction, Action friendsAction) {
		if ((myAction == Action.KAMEN && friendsAction == Action.NOZHNICI) 
		|| (myAction == Action.NOZHNICI && friendsAction == Action.BUMAGA)
		|| (myAction == Action.BUMAGA && friendsAction == Action.KAMEN)) {
			System.out.println(name + " победил");
		}
	}
	
	public void run() {
		Action reply;
		for (Action action : myActions) {
			try {
				reply = exchanger.exchange(action);
				whoWins(action, reply);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
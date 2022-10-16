package lambda;

import java.util.ArrayList;

public class RemoveIf {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("privet");
		arrayList.add("poka");
		arrayList.add("ok");
		arrayList.add("a imenno lamddas");
		
		arrayList.removeIf(s -> s.length() < 5);
		System.out.println(arrayList);
	}
}

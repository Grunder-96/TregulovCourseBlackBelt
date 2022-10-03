package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
	
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1000, "Zaur Tregulov");
		map.put(3568, "Ivan Ivanov");
		map.put(6578, "Mariya Sidorova");
		map.put(15879, "Nikolay Petrov");
		
//		map.put(98745, "Nikolay Petrov");
		
//Перезапишет value по указанному ключу
//		map.put(15879, "Oleg Ivanov");
		
//Вставка пары с ключом null
		map.put(null, "Sergey Novikov");
		map.put(null, "Sergey Novikov");
//Вставка пары со значением null
		map.put(89547, null);
		
//Вставка в случае, если value null или отсутствует
		System.out.println(map.putIfAbsent(53543, "Grigoriy Rasputin"));	
		System.out.println(map);
		
		System.out.println(map.get(1000));
		System.out.println(map.remove(1000));
		
		System.out.println(map.containsValue("Nikolay Petrov"));
		System.out.println(map.containsKey(null));
		
		System.out.println(map.keySet());
		System.out.println(map.values());
	}
}

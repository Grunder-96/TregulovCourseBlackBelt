package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods5 {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Russia");
		arrayList.add("USA");
		arrayList.add("Hungary");
		arrayList.add("Germany");
		arrayList.add("Italy");
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("Russia");
		arrayList2.add("USA");
		arrayList2.add("Korea");
		
//removeAll(Collection<?> c) -> boolean
//		System.out.println(arrayList.removeAll(arrayList2));
//		System.out.println(arrayList);
		
//retainAll(Collection<?> c) -> boolean
//Оставит только те элементы, которые встречаются в коллекции, переданной в качестве параметра
//		System.out.println(arrayList.retainAll(arrayList2));
//		System.out.println(arrayList);
		
//containsAll(Collection<?> c) -> boolean
//Вернет true только в том случае, если текущий arrayList содержит все элементы коллекции, переданной в качестве параметра
//		System.out.println(arrayList.containsAll(arrayList2));
		
//subList(int fromIndex, int toIndex) -> List<E> 
//Sublist не существует отдельно от изначального arrayList, а является его представлением
//		List<String> sublist = arrayList.subList(1, 4);
//		System.out.println(sublist);
//		sublist.add("Georgia");
//		System.out.println(arrayList);
//		arrayList.add("Bangladesh");
//		System.out.println(sublist);
		
//toArray() -> Object[]
//		Object[] array = arrayList.toArray();
//		for (Object el : array) {
//			System.out.print((String) el + " ");
//		}
		
//toArray(T[] a) -> T[]
//		String[] array = arrayList.toArray(new String[0]);
//		System.out.println(Arrays.toString(array));
		
//List.of(E ... elements) -> List<E>(after jdk8)
//List на выходе невозможно изменить(при модификации UnsupportedOperationException). Он не должен содержать null.
//		List<Integer> list = List.of(1, 2, 3, 4, 5);
//		list.add(6);
		
//List.copyOf(Collection<E> e) -> List<E>(after jdk8)
//List на выходе невозможно изменить(при модификации UnsupportedOperationException). Он не должен содержать null.	
		List<String> copy = List.copyOf(arrayList);
		System.out.println(copy);
		
	}
	
}

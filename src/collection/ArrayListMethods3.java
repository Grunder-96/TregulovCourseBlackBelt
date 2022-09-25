package collection;

import java.util.ArrayList;

public class ArrayListMethods3 {
	
	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Russia");
		arrayList.add("USA");
		arrayList.add("Hungary");
		arrayList.add("Germany");
		
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("!!!");
		arrayList2.add("???");
		arrayList2.add("!!!");
		
//add(ArrayList aL) -> boolean
//add(int index, ArrayList aL) -> boolean		
		System.out.println(arrayList);
//		arrayList.addAll(arrayList2);
		arrayList.addAll(1, arrayList2);
//		System.out.println(arrayList);
		
//clear() -> void
//		arrayList.clear();
//		System.out.println(arrayList);
		
//indexOf(Object element) -> int(используется equals)
//lastIndexOf(Object element) -> int(используется equals)
//		System.out.println(arrayList.indexOf("!!!"));
//		System.out.println(arrayList.lastIndexOf("!!!"));
		
//size() -> int
//		System.out.println(arrayList.size());
		
//isEmpty() -> boolean
//		System.out.println(arrayList.isEmpty());
//		System.out.println(new ArrayList<>().isEmpty());
		
//contains(Object element) -> boolean(используется equals)
		System.out.println(arrayList.contains("Hungary"));
		System.out.println(arrayList.contains("Columbia"));
		
//toString() -> String
		System.out.println(arrayList);
		
	}
	
}

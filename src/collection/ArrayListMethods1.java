package collection;

import java.util.ArrayList;

public class ArrayListMethods1 {
	
	public static void main(String[] args) {
		
//add(DataType element) -> boolean
//add(int index, DataType element) -> boolean
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("Russia");
		arrayList.add("USA");
		arrayList.add("Hungary");
		arrayList.add(1, "Germany");				
//		//unchecked IndexOutOfBoundsException
//		arrayList.add(6, "Germany");
		
		//get(int index) -> DataType
		System.out.println(arrayList.get(0));
//		//unchecked IndexOutOfBoundsException
//		System.out.println(arrayList.get(6));
		
//set(int index, DataType element) -> DataType(replace analogue)
		arrayList.set(0, "Russian Empire");
		
//remove(Object element) -> boolean
//remove(int index) -> DataType
		arrayList.remove("USA");
		//System.out.println(arrayList.remove(2));
		
		System.out.println(arrayList);
	}
}

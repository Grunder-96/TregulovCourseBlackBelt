package collection;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethods4 {
	
	public static void main(String[] args) {
		
		StringBuilder st1 = new StringBuilder("A");
		StringBuilder st2 = new StringBuilder("B");
		StringBuilder st3 = new StringBuilder("C");
		StringBuilder st4 = new StringBuilder("D");
		StringBuilder st5 = new StringBuilder("E");
		
//Arrays.asList(DataType[]) -> List<DataType>
//Создаваемый list связан с массивом, который он содержит в своей основе
		StringBuilder[] array = {st1, st2 ,st3 ,st4, st5};
		List<StringBuilder> list = Arrays.asList(array);
		System.out.println(list);
		array[0] = new StringBuilder("ABC");
//		array[0].append("!!!");
		System.out.println(list);
		
	}
	
}

package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	
	public static void main(String[] args) {
		List<?> list = new ArrayList<String>();
		//list.add("America");
		
		List<? extends Number> list3 = new ArrayList<Integer>();
		
		ArrayList<Double> list4 = new ArrayList<>();
		list4.add(3.16);
		list4.add(8.93);
		list4.add(12.1);
		System.out.println(sum(list4));
		
		List<Double> list1 = new ArrayList<>();
		list1.add(3.14);
		list1.add(5.28);
		list1.add(9.16);	
		Test3.showListInfo(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Moscow");
		list2.add("Tula");
		list2.add("Kazan");	
		showListInfo(list2);
	}
	
	static void showListInfo(List<?> list) {
		System.out.println("My list contains the following elements: " + list);
	}
	
	public static double sum(List<? extends Number> list) {
		double sum = 0;
		for (Number value : list) {
			sum += value.doubleValue();
		}
		return sum;
	}
}

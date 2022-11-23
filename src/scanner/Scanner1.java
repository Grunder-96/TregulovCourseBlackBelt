package scanner;

import java.util.Scanner;

public class Scanner1 {
	
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Vvedite chislo: ");
//		int i = scanner.nextInt();
//		System.out.println("Vvedennoe chislo: " + i);
		
//		System.out.println("Vvedite dva chisla: ");
//		int x = scanner.nextInt();
//		int y = scanner.nextInt();
//		System.out.println("Chastnoe = " + x / y);
//		System.out.println("Ostatok = " + x % y);
		
//		System.out.println("Napishite stroku: ");
//		String s1 = scanner.next();
//		System.out.println("1 stroka: " + s1);
		
//		System.out.println("Vvedite drobnoe chislo: ");
//		double d = scanner.nextDouble();
//		System.out.println("Vvedennoe chislo: " + d);
		
		Scanner scanner = new Scanner("Privet,  moy drug\nKak pozhivaesh?\nChto horoshego?");
//		String s1 = scanner.nextLine();
//		System.out.println(s1);
//		System.out.println(scanner.nextLine());
//		System.out.println(scanner.nextLine());
		
//		while (scanner.hasNextLine()) {
//			System.out.println(scanner.nextLine());
//		}
		
		System.out.println(scanner.next().charAt(2));
		scanner.close();
	}
}	

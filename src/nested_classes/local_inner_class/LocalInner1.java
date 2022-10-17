package nested_classes.local_inner_class;

public class LocalInner1 {
	public static void main(String[] args) {
		Math math = new Math();
		math.getResult(21, 4);
	}
}

class Math {
	
	private int a = 10;
	
	public void getResult(int delimoe, int delitel) {
//		int delimoe = 21;
		class Delenie {
			
//			private int delimoe;
//			private int delitel;
			
//			public int getDelimoe() {
//				return delimoe;
//			}
//			
//			public void setDelimoe(int delimoe) {
//				this.delimoe = delimoe;
//			}
//			
//			public int getDelitel() {
//				return delitel;
//			}
//			
//			public void setDelitel(int delitel) {
//				this.delitel = delitel;
//			}
//			
			public int chastnoe() {
				return delimoe / delitel;
			}
			
			public int getOstatok() {
				System.out.println(a);
				return delimoe % delitel;
			}
		}
		
		Delenie del = new Delenie();
//		del.setDelimoe(21);
//		del.setDelitel(4);
//		System.out.println(del.getDelimoe());
//		System.out.println(del.getDelitel());
		System.out.println(del.chastnoe());
		System.out.println(del.getOstatok());
		
	}
}

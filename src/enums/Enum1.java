package enums;

public class Enum1 {
	
	public static void main(String[] args) {
		Today today = new Today(WeekDays.SATURDAY);
		today.daysInfo();
		System.out.println(today.weekDay);
		WeekDays weekDay1 = WeekDays.FRIDAY;
		WeekDays weekDay2 = WeekDays.FRIDAY;
		WeekDays weekDay3 = WeekDays.MONDAY;
		System.out.println(weekDay1 == weekDay2);
		System.out.println(weekDay2 == weekDay3);
		
//		System.out.println(WeekDays.FRIDAY == WeekDays2.FRIDAY);
		System.out.println(WeekDays.FRIDAY.equals(weekDay3.FRIDAY));
		WeekDays w1 = WeekDays.valueOf("MONDAY");
		System.out.println(w1);
		WeekDays[] weekDays = WeekDays.values();
		for (WeekDays day : weekDays) {
			System.out.println(day);
		}
	}
}

enum WeekDays {
	
	MONDAY("bad"), 
	TUESDAY("bad"), 
	WEDNESDAY("so-so"), 
	THURSDAY("so-so"),
	FRIDAY("good"), 
	SATURDAY("great"), 
	SUNDAY("good");
	
	private String mood;
	
	private WeekDays(String mood) {
		this.mood = mood;
	}
	
	String getMood() {
		return this.mood;
	}
}

enum WeekDays2 {
	
	MONDAY, 
	TUESDAY, 
	WEDNESDAY, 
	THURSDAY,
	FRIDAY, 
	SATURDAY, 
	SUNDAY;
}

class Today {
	
	WeekDays weekDay;
	
	public Today(WeekDays weekDay) {
		this.weekDay = weekDay;
	}
	
	public void daysInfo() {
		switch (weekDay) {
			case MONDAY:
				System.out.println("It's MONDAY");
				break;
			case TUESDAY:
				System.out.println("It's TUESDAY");
				break;
			case WEDNESDAY:
				System.out.println("It's WEDNESDAY");
				break;
			case THURSDAY:
				System.out.println("It's THURSDAY");
				break;
			case FRIDAY:
				System.out.println("It's FRIDAY");
				break;
			case SATURDAY:
				System.out.println("It's SATURDAY");
				break;
			case SUNDAY:
				System.out.println("It's SUNDAY");
				break;
		}
		System.out.println("Nastroenie v etot den: " + weekDay.getMood());
	}
}

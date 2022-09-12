public class DateCheck {
	public static void main(String[] args) {
	
		Date date1=new Date();
		date1.displayDate();
		System.out.println(date1.checkDate()? "Valid Date":"Invalid Date");
		
		System.out.println();
		Date date2=new Date(9,9,2022);
		date2.displayDate();
		System.out.println(date2.checkDate()? "Valid Date":"Invalid Date");
		System.out.println();
		
		Date date3=new Date(32,9,2022);
		date3.displayDate();
		System.out.println(date3.checkDate()? "Valid Date":"Invalid Date");
		System.out.println();
		
		Date date4=new Date(2,19,2022);
		date4.displayDate();
		System.out.println(date4.checkDate()? "Valid Date":"Invalid Date");
		System.out.println();
		
		Date date5=new Date(2,11,-2022);
		date5.displayDate();
		System.out.println(date5.checkDate()? "Valid Date":"Invalid Date");
	}
}
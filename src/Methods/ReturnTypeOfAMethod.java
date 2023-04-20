package Methods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReturnTypeOfAMethod {

	public static String m1() {
		
		
		return "Ermina";
		
	}
	
	public static String currentTime () {
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("DD/MM/YYYY");
		LocalDateTime now = LocalDateTime.now();
	
		String date = pattern.format(now);
		return date;
		
	}
	
	
	public static void main(String[] args) {
		String variable = m1();
		System.out.println("Value of a variable is " +variable);
        String currentDate = currentTime();
        System.out.println("CurrentDate  is "  +currentDate);
	}
	
	
	

}

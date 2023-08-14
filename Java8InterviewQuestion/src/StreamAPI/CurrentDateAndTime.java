package StreamAPI;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		 
		 //Used LocalDate API to get the date,time and date &time
		System.out.println("CurrentLocal Date   "+ java.time.LocalDate.now());
		
		System.out.println("Current time  "+java.time.LocalTime.now());
		
		System.out.println("Current dateTime  "+java.time.LocalDateTime.now());
	}

}

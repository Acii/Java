package _03_LoopsMethodsClasses;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class _07_DaysBetweenTwoDates {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		try {
			LocalDate firstDate = LocalDate.parse(reader.nextLine(), DateTimeFormatter.ofPattern("d-M-yyyy"));

			LocalDate secondDate = LocalDate.parse(reader.nextLine(), DateTimeFormatter.ofPattern("d-M-yyyy"));

			long daysBetweenDates = ChronoUnit.DAYS.between(firstDate, secondDate);

			System.out.println("Days between " + firstDate + " and " + secondDate + " : " +
								daysBetweenDates + " days");

		} catch (DateTimeParseException e) {
			System.out.println("You entered the date in the wrong format.");
		}		
	}
}


}

package hackerRankCodingQuestions;

import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateandTime {
	
	public static void dateTimeNow() {
		LocalDate myObjDate=LocalDate.now();
		System.out.println(myObjDate);
		
	}
	public static String findDay(int day,int month, int year) {
		// TODO Auto-generated method stub
		LocalDate localDate = LocalDate.of(year, month, day);
		return localDate.getDayOfWeek().name();
	}

	public static void main(String[] args) {
		dateTimeNow();
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Give month");
			int month = scanner.nextInt();
			System.out.println("Give date");
			int day = scanner.nextInt();
			System.out.println("Give year ");
			int year = scanner.nextInt();

			String dayString = findDay(day,month, year);
			System.out.println(dayString);
		}
	}
}

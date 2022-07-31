package hackerRankCodingQuestions;

import java.util.*;
import java.text.*;

public class JavaCurrencyFormatter {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double payment = sc.nextDouble();
		sc.close();
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		String canada = NumberFormat.getCurrencyInstance(Locale.CANADA).format(payment);
		String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);

		System.out.println("US: " + us);
		System.out.println("Canana: " + canada);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
		System.out.println("India: " + india);

	}

}

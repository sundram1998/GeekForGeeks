package hackerRankCodingQuestions;

import java.util.Scanner;

public class JavaLexicographicalString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two Strings");
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		scanner.close();
		int lenA = A.length();
		int lenB = B.length();
		int sum = lenA + lenB;
		System.out.println(sum);
		System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) 
		+ " " + B.substring(0, 1).toUpperCase()
				+ B.substring(1));

	}

}

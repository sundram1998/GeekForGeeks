package hackerRankCodingQuestions;

import java.util.Scanner;

public class EndOfLine {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int i = 0;
			while (scan.hasNext()) {
				i++;
				System.out.println(i + " " + scan.nextLine());
			}
		}

	}

}

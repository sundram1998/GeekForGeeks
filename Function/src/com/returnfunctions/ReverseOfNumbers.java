package com.returnfunctions;

import java.util.Scanner;

public class ReverseOfNumbers {
	public static void main(String[] args) {
		ReverseOfNumbers reverseOfNumbers = new ReverseOfNumbers();
		StringBuilder rev = reverseOfNumbers.rev();
		System.out.println(rev);
	}

	public StringBuilder rev() {
		System.out.println("Enter the number:");
		try (Scanner scanner = new Scanner(System.in)) {
			String numBuilder = scanner.nextLine();
			StringBuilder sbv = new StringBuilder(numBuilder);
			sbv = sbv.reverse();
			return sbv;
		}
	}

}

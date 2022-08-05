package com.returnfunctions;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter rows: ");
			int rows=scanner.nextInt();
			System.out.println("Enter colms");
			int colms=scanner.nextInt();
			int array[][]=new int[rows][colms];
			System.out.println("Enter values: ");
			//To Give Output
			for(int i=0;i<colms;i++) {
				for(int j=0;j<rows;j++) {
					array[i][j]=scanner.nextInt();
				}
			}
			System.out.println("Array values are: ");
			//To print array
			for(int i=0;i<colms;i++) {
				for(int j=0;j<rows;j++) {
					System.out.print(array[i][j]);
				}
			}
		}
		
	}

}

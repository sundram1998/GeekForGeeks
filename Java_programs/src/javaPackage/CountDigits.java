 package javaPackage;

import java.util.Scanner;

//To count the number of digits in a number
public class CountDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			int count=0;
			while (num>0) {
				num=num/10;
				count++;
			}
			System.out.println(count);
		}
		
	}
 
}

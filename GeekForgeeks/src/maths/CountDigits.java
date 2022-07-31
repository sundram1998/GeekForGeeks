package maths;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		// int Stores whole numbers from -2,147,483,648 to 2,147,483,647
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
		sc.close();

	}

}

package practiceGFGArrays;

import java.util.Scanner;
public class SumOfMultiplesOf3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner sc=new Scanner(System.in);
		int t=2;
		for (int a0 = 0; a0 < t; a0++) {
			int sum = 0;
			System.out.println("Enter N");
			int n=sc.nextInt();
			for (int i = 3; i < n; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum = sum + i;
				}
			}
			System.out.println(sum);
		}

	}

}

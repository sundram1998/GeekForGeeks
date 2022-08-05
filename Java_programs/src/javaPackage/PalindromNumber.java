package javaPackage;

import java.util.Scanner;

public class PalindromNumber{
	public static void main(String[] args) {
		System.out.println("Enter The Number :");
		try (Scanner sc = new Scanner(System.in)) {
			int num=sc.nextInt();
			int rev=0;
			int ori_num=num;
			while(num>0) {
			rev=rev*10+num%10;	
			num=num/10;
			}
			if(rev==ori_num) {
				System.out.println("True");
			}else {
				System.out.println("False");
			}
		}
		
	}


}

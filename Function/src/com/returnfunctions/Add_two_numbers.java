package com.returnfunctions;

public class Add_two_numbers {
	public static void main(String[] args) {
		Add_two_numbers obj=new Add_two_numbers();
		int sum =obj.addTwoNumbers(9, 9);
		System.out.println(sum);
		
	}
	public int addTwoNumbers(int a,int b) {
		int sum=a+b;
		return sum;
	}

}

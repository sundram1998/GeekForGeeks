package maths;

import java.util.Arrays;

public class PowerOfNumber {
	// efficient Solution
	static int power1(int x, int n) {
		int res = 1;
		while (n > 0) { //time complexity-O(logn)
			if (n % 2 != 0)//n&1
				res = res * x; 
			x = x * x;
			n = n / 2;//n=n>>1
		}
		return res;
	}

	// Naive solution
	static int power(int x, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res = res * x;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(power1(4, 5));
		
	}

}

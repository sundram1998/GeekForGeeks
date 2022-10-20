package practiceGeekForGeek;

import java.util.Arrays;

public class MaximizeSumOfAnArray {
//	Given an array A of N integers. Your task is to write a program to find the maximum value of arr[i]*i, where i = 0, 1, 2,., n 1.
//	You are allowed to rearrange the elements of the array.
//	Note: Since output could be large, hence module 109+7 and then print answer.
	static int maximize(int arr[]) {
		// Complete the function
		int n=arr.length;
		Arrays.sort(arr);
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + (long) arr[i] * i;
		}
		return (int) (sum % (1000000007));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar= {1,2,3,5,6};
		System.out.println(maximize(ar));

	}

}

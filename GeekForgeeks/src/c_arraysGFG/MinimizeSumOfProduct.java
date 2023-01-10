package c_arraysGFG;

import java.util.Arrays;

// https://practice.geeksforgeeks.org/problems/minimize-the-sum-of-product1525/1?page=1&curated[]=1&sortBy=submissions
public class MinimizeSumOfProduct {

	static long minSumOfProduct(long[] a, long[] b) {
		int n = a.length;
		Arrays.sort(a);
		Arrays.sort(b);
		long result = 0;
		long i = 0;
		long j = (n - 1);
		while (i < n) {
			result += a[(int) i] * b[(int) j];
			i++;
			j--;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long A[] = { 3, 1, 1 };
		long B[] = { 6, 5, 4 };
		System.out.println(minSumOfProduct(A, B));
	}

}

package practiceGFGArrays;

import java.util.ArrayList;

// https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1?page=1&difficulty[]=0&category[]=Arrays&sortBy=submissions
public class SubArrayWithGivenSum {
	
	static ArrayList<Integer> subArray(int[] arr) {
		int n=arr.length;
		int sum=12;
		int currSum=0;
		ArrayList<Integer > aList =new ArrayList<Integer>();
		for(int i=0;i<n;i++) {	
			for(int j=i;j<n;j++) {
				currSum+=arr[j];
				if (currSum==sum) {
					aList.add(i);
					aList.add(j);
					return aList;
				}
			}
			currSum=0;
		}
		aList.add(-1);
		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,-2,3,4};
		System.out.println(subArray(arr));

	}

}

package practiceGFGArrays;

import java.util.ArrayList;

public class FindMinMax {
	static ArrayList<Long> getMinMax(long[] arr) {
		ArrayList<Long> list=new ArrayList<Long>();
		int n=arr.length;
		long min=arr[0];
		long max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		list.add(min);
		list.add(max);
		return list;
	}

	public static void main(String[] args) {
		// Given an array A of size N of integers. 
		//Your task is to find the minimum and maximum elements in the array.
		long arr[] = { 3, 5, 4, 2, 6, 2, 5, 3, 0, 0, 5, 4, 8, 3 };
		System.out.println(getMinMax(arr));

	}

}

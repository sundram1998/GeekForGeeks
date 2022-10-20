package practiceGeekForGeek;

import java.util.ArrayList;

public class FirstAndLastositionOfX {
	//complexity O(n)
	static ArrayList<Long> find(long arr[], int x) {
		// code here
		int n = arr.length;
		long first = -1, second = -1, verify = 0;
		for (int i = 0; i < n; i++) {//long arr[] = { 1, 2, 2, 2, 2, 3, 8, 7, 8, 8 };
			if (arr[i] == x && verify == 0) {
				first = i;
				verify = 1;
				System.out.println(first+" first");
				System.out.println(verify+" verify");
			}
			if (arr[i] == x)
				second = i;
			System.out.println(second+" second");
		}
		ArrayList<Long> a = new ArrayList<>();
		a.add(first);
		a.add(second);
		return a;
	}
//complexity O(log n)
	public static int first(ArrayList<Integer> list, int x) {
		// return first occurrence index
		// of element x in ArrayList
		// using method indexOf()
		return list.indexOf(x);
	}

	public static int last(ArrayList<Integer> list, int x) {
		// return last occurrence index
		// of element x in ArrayList
		// using method lastIndexOf()
		return list.lastIndexOf(x);
	}

	public static void main(String[] args) {
		long arr[] = { 1, 2, 2, 2, 2, 3, 8, 7, 8, 8 };
		System.out.println(find(arr, 8));
//		ArrayList<Integer> clist = new ArrayList<>();
//
//		// adding elements of array to ArrayList
//		for (int i : arr)
//			clist.add(i);
//		int x = 8;
//
//		// displaying the first occurrence
//		System.out.println("First Occurrence = " + first(clist, x));
//
//		// displaying the last occurrence
//		System.out.println("Last Occurrence = " + last(clist, x));
//	}

	}
}

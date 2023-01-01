package practiceGFGArrays;
// https://practice.geeksforgeeks.org/problems/convert-array-into-zig-zag-fashion1638/1?page=1&difficulty[]=-1&curated[]=1&sortBy=submissions

// Hold ctrl and hover on link to see problem

public class ZigZagArray {

	static void makeZigZagArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0 & i + 1 < n) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			} else {
				if (i + 1 < n) {
					if (arr[i] < arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] zig = { 4, 3, 7, 8, 6, 2, 1 };
		makeZigZagArray(zig);

	}

}

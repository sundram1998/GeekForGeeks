package c_arraysGFG;

public class LargestElement {
	//Efficient Approach
	static int getLargest(int[] arr) {
		int n=arr.length;
		int largest=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[largest]) {
				largest=i;
			}
		}
		return largest;
	}
	// Naive approach
	static int largest(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (a[j] > a[i]) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 10, 5, 208, 8,56 };
		System.out.println(largest(a));
		System.out.println(getLargest(a));

	}

}

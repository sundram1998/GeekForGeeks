package e_searching;

//Find the peak in unsorted array. 
//Peak is an element which is greater than its neighbors
public class PeakElementInAnArray {
	static int getPeak(int[] arr) {
		int n = arr.length;
		if (n == 1)
			return arr[0];
		if (arr[0] > arr[1])
			return arr[0];
		if (arr[n - 1] > arr[n - 2])
			return arr[n - 1];
		for (int i = 1; i < n - 1; i++) {
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return arr[i];
		}
		return -1;
	}

	// Binary Search method
	static int getpeakBinary(int[] arr) {
		int n = arr.length;
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (mid == 0 || arr[mid - 1] <= arr[mid] && 
				mid == n - 1 || arr[mid + 1] <= arr[mid]) {
				return arr[mid];
			}
			if (mid > 0 && arr[mid] <= arr[mid - 1])
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 30, 40, 30, 45, 60, 77, 67 };
		int a[] = { 2, 13 };
		System.out.println(getPeak(arr));
		System.out.println(getpeakBinary(a));
	}
}

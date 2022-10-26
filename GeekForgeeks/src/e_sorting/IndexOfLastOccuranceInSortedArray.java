package e_sorting;

public class IndexOfLastOccuranceInSortedArray {
// Recursive solution
	static int lastOccurrence(int arr[], int low, int high, int x) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (arr[mid] < x)
			return lastOccurrence(arr, mid + 1, high, x);
		else if (arr[mid] > x)
			return lastOccurrence(arr, low, mid - 1, x);
		else {
			if (mid == arr.length - 1 || (arr[mid] == x && arr[mid + 1] != x))
				return mid;
			else
				return lastOccurrence(arr, mid + 1, high, x);
		}

	}
// Iterative Solution
	static int lastOccur(int[] arr, int x) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < x)
				low = mid + 1;
			if (arr[mid] > x)
				high = mid - 1;
			else {
				if (mid == arr.length - 1 || (arr[mid] == x && arr[mid + 1] != x)) {
					return mid;
				} else
					low = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 6, 7, 8, 9 };
		int x = 3;
		System.out.println(lastOccurrence(array, 0, array.length - 1, x));
		System.out.println(lastOccur(array, x));

	}

}

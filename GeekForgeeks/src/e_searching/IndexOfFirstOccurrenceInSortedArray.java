package e_searching;
// Note: This is for Sorted Array
public class IndexOfFirstOccurrenceInSortedArray {
	// Iterative Solution
	static int firstOcc(int arr[], int x) {
		int low = 0, high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] > x)
				high = mid - 1;
			else if (arr[mid] < x)
				low = mid + 1;
			else {
				if (mid == 0 || (arr[mid] == x && arr[mid - 1] != x))
					return mid;
				else
					high = mid - 1;
			}
		}
		return -1;
	}

	// recursive solution
	static int firstOccurrence(int[] arr, int low, int high, int x) {
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (x > arr[mid])
			return firstOccurrence(arr, mid + 1, high, x);
		else if (x < arr[mid])
			return firstOccurrence(arr, low, mid - 1, x);
		else {
			if (mid == 0 || (arr[mid] == x && arr[mid - 1] != x))
				return mid;
			else
				return firstOccurrence(arr, low, mid - 1, x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,1,1,1,2,2,3,3};
		int x = 1;
		System.out.println(firstOccurrence(array, 0, array.length - 1, x));
		System.out.println(firstOcc(array, x));
	}

}

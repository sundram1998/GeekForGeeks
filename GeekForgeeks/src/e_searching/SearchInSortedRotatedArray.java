package e_searching;

public class SearchInSortedRotatedArray {
	// Naive Approach
	static int search(int arr[], int x) {
		int n = arr.length - 1;
		for (int i = 1; i <= n; i++) {
			if (arr[i] == x)
				return i;
		}
		return -1;
	}

	// Efficient Aproach
	static int searchInSortedRotatedArray(int arr[], int x) {
		int n = arr.length - 1;
		int low = 0, high = n;
		while (low <= high) {
			int mid = (low + high) / 2; // mid=(0+6)/2=3 || low=mid+1==3+1=4==low, high=6
			if (arr[mid] == x) // mid=4+6=10/2=5 ,high=5,low=4,mid=4 arr[4]==20
				return mid;
			if (arr[low] < arr[mid]) {// int arr[] = { 100, 200, 300, 400, 20, 30, 40 };
				if (x >= arr[low] && x < arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			} else {
				if (x > arr[mid] && x < arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 200, 300, 400, 20, 30, 40 };
		int array[] = { 100, 500, 10, 20, 30, 40, 50 };
		System.out.println(searchInSortedRotatedArray(arr, 20));
		System.out.println(searchInSortedRotatedArray(array, 500));

	}

}

package e_searching;

public class CountOccurenceOfOneInReverseBinarySortedArrays {
     // Given a binary sorted non-increasing array of 1s and 0s. 
	// You need to print the count of 1s in the binary array.
	// array[] = {1,1,1,1,1,0,0,0}

	// complexity O(logN)
	static int countOnes(int[] arr) {
		int n = arr.length;
		int low = 0, high = n - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == 0)
				high = mid - 1;
			else {
				if (mid == n - 1 || arr[mid] != arr[mid + 1]) {
					return (mid + 1);
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
// Efficient
	static int countOnesInReverseSortedArray(int[] arr) {
		int n=arr.length;
		int low=0,high=n-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==1) low=mid+1;
			else high=mid;
		}
		return high;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 1, 1,1,1, 0, 0, 0, 0, 0, 0 };
		System.out.println(countOnes(arr));
		System.out.println(countOnesInReverseSortedArray(arr));

	}

}

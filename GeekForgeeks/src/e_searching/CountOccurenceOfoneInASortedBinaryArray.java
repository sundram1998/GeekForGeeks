package e_searching;

public class CountOccurenceOfoneInASortedBinaryArray {

	static int occurenceOfOne(int arr[]) {
		int n = arr.length;
		int low = 0, high = n-1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] < 1)
				low = mid + 1;
			else {
				if (mid == 0 || arr[mid - 1] != arr[mid])
					return (n - mid);
				else {
					high = mid - 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 0, 0, 1, 1, 1, 1, 1 };
		System.out.println(occurenceOfOne(arr));

	}

}

package e_searching;

public class SearchInInfiniteArray {
	//time complexity O(position)
	// Naive Solution
	static int searchInInfiniteArray(int[] arr, int x) {
		int i = 0;
		while (true) {
			if (arr[i] == x)
				return i;
			if (arr[i] > x)
				return -1;
			i++;
		}
	}
	// Efficient solution
	// time complexity of efficient solution O(log(position))
	static int search(int[] arr, int x) {
		if (arr[0] == x)
			return 0;
		int i = 1;
		while (arr[i] < x) {
			i = i * 2;
		}
		if (arr[i] == x)
			return i;
		// we will search from i/2+1 (half of the current index) and i current index
		return BinarySearch.bSearchRecursive(arr, (i / 2) + 1, i, x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 5, 6, 7, 8, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24 };
		System.out.println(searchInInfiniteArray(arr, 4));
		System.out.println(search(arr, 5));

	}

}

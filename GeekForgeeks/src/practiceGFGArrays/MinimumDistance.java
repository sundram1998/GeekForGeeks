package practiceGFGArrays;

public class MinimumDistance {
	static int naiveSolution(int[] arr, int x, int y) {
		int n = arr.length;
		int minDist = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == x && arr[j] == y || arr[i] == y && arr[j] == x && minDist > Math.abs(i - j)) {
					minDist = Math.abs(i - j);
				}
			}
		}
		if (minDist == Integer.MAX_VALUE)
			return -1;

		return minDist;
	}

//Efficient Solution
	int minDist(int arr[], int n, int x, int y) {
		// previous index and min distance
		int i = 0, p = -1, min_dist = Integer.MAX_VALUE;
		for (i = 0; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				p = i;
				break;
			}
		}
		for (; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				// we will check if p is not equal to -1 and
				// If the element at current index matches with
				// the element at index p , If yes then update
				// the minimum distance if needed
				if (p != -1 && arr[i] != arr[p])
					min_dist = Math.min(min_dist, i - p);
				// update the previous index
				p = i;
			}
		}
		// If distance is equal to int max
		if (min_dist == Integer.MAX_VALUE)
			return -1;
		return min_dist;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumDistance min = new MinimumDistance();
		int arr[] = { 3, 5, 4, 2, 6, 2, 5, 3, 0, 0, 5, 4, 8, 3 };
		int n = arr.length;
		int x = 3;
		int y = 6;
		System.out.println("Minimum distance between " + x + " and " + y + " is " + min.minDist(arr, n, x, y));
	}

}

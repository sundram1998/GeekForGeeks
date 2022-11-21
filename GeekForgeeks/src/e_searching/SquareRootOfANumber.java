package e_searching;

public class SquareRootOfANumber {
	static int squareRoot(int x) {
		int i = 1;
		while (i * i < x)
			i++;
		return i - 1;
	}

	static int squareRootByBinarySort(int n) {
		int low = 0, high = n, ans = -1;
		while (low <= high) {
			int mid = (low + high);
			int sqr = mid * mid;
			if (sqr == n) {
				return mid;
			} else {
				if (sqr > n)
					high = mid - 1;
				else {
					low = mid + 1;
					ans = mid;
				}
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(13));
		System.out.println(squareRootByBinarySort(17));
	}
}

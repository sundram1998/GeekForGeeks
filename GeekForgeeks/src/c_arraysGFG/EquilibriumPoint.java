package c_arraysGFG;

public class EquilibriumPoint {
	// time 0.81
	public static int equilibriumPoint(int[] arr, int n) {

 // Your code here
		long TotalSum = 0, beforeSum = 0, currentSum = 0;

		if (n == 1) {

			return 1;

		}

		for (int i = 0; i < n; i++) {

			TotalSum += arr[i];

		}

		for (int i = 0; i < n; i++) {

			currentSum = TotalSum - beforeSum - arr[i];

			if (currentSum == beforeSum)

				return i + 1;

			beforeSum += arr[i];

		}

		return -1;
	}

    // time 0.80
	static boolean ePoint1(int[] arr) {
		int n = arr.length;
		int[] ls = new int[n];
		ls[0] = 0;
		for (int i = 1; i < n; i++) {
			ls[i] = arr[i - 1] + ls[i - 1];
		}
		int[] rs = new int[n];
		rs[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			rs[i] = arr[i + 1] + rs[i + 1];
		}
		for (int i = 0; i < n; i++) {
			if (ls[i] == rs[i]) {
				return true;
			}
		}
		return false;
	}

    // time 0.78
	static boolean ePoint(int[] arr) {
		int n = arr.length;
		int rs = 0;
		for (int i = 0; i < n; i++) {
			rs += arr[i];
		}
		int ls = 0;
		for (int i = 0; i < n; i++) {
			rs = rs - arr[i];
			if (ls == rs)
				return true;
			ls += arr[i];
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4 };
		System.out.println(ePoint(arr));
		System.out.println(ePoint1(arr));
		System.out.println(equilibriumPoint(arr, 1));

	}

}

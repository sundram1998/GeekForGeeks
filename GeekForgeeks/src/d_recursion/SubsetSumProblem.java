package d_recursion;

public class SubsetSumProblem {
	static int subset(int arr[], int n, int sum) {
		if (n == 0)
			return sum == 0 ? 1 : 0;
		return subset(arr, n - 1, sum) + subset(arr, n - 1, sum - arr[n - 1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 15, 20,5,15 };
		int ans = subset(arr, 5, 25);
		System.out.println(ans);
	}

}

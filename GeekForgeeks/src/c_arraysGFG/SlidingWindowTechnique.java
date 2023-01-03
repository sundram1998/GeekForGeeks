package c_arraysGFG;

// Find max sum of k consecutive elements
public class SlidingWindowTechnique {

	static int maxSum(int[] arr, int k) {
		int n=arr.length;
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += arr[i];
		}
		int res = sum;
		for (int i = k; i < n; i++) {
			sum+=arr[i]-arr[i-k];
			res=Math.max(res, sum);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,8,30,-5,20,7};
		System.out.println(maxSum(arr, 3));

	}

}

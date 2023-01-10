package c_arraysGFG;

//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
public class MinimumNumberOfJumps {
	static int minJumpss(int[] arr) {
		// your code here
		int count = 0, current = 0, max = 0;
		for (int i = 0; i < arr.length; i++) {
			max = Math.max(max, i + arr[i]);
			if (current >= arr.length - 1)
				break;
			else if (max <= i)
				return -1;
			else if (i == current) {
				current = max;
				count++;
			}
		}
		return count;
	}

	int minJumps1(int arr[], int n) {
		// Your code here
		if (arr[0] == 0 && n > 1)
			return -1;
		if (n == 1)
			return 0;
		int far = 0;
		int curr = 0;
		int jump = 0;

		for (int i = 0; i < n - 1; i++) {
			far = Math.max(far, i + arr[i]);
			if (i == curr) {
				jump++;
				curr = far;
			}

		}

		if (curr < n - 1)
			return -1;
		return jump;
	}

	static int minJumps(int[] arr) {
		int n = arr.length;
		int maxR = arr[0];
		int step = arr[0];
		int jumps = 1;
		if (n == 1)
			return 0;
		else if (arr[0] == 0)
			return -1;
		for (int i = 1; i < n; i++) {
			maxR = Math.max(maxR, i + arr[i]);
			if (step == i) {
				jumps++;
				if (maxR <= i) {
					return -1;
				}
				step = maxR;
			}
		}
		if (step < n - 1)
			return -1;
		return jumps;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 5, 8, 0, 2, 6, 7, 6, 8, 9 };
		System.out.println(minJumps(arr));

	}

}

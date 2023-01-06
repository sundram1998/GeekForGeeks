package c_arraysGFG;

public class SubArrayOfGivenSum {

	static boolean isSubArray(int[] arr, int sum) {
		int n = arr.length;
		int s = 0, curSum = 0;
		if(sum==0) return false;
		for (int i = 0; i < n; i++) {
			curSum += arr[i];
			while (sum < curSum) {
				curSum -= arr[s];
				s++;
			}
			if (sum == curSum) {
				System.out.println("SubArray is from "+s +"  to "+i  );
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subArray[] = { 1, 4, 20, 3, 10, 5 };
		System.out.println(isSubArray(subArray, 25));
		int subArray1[] = { 10, 20, 4, 3, 1, 5 };
		System.out.println(isSubArray(subArray1, 0));
	}

}

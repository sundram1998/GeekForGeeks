package c_arraysGFG;

public class MaximumCircularSubArraySum {
	
	static int maxSum(int arr[]) {
		int n=arr.length;
		int res=0;
		for(int i=0;i<n;i++) {
			int curMax=arr[i];
			int curSum=arr[i];
			for(int j=1;j<n;j++) {
				int index=(i+j)%n;
				curSum=curSum+arr[index];  //int[] arr= {5,-2,3,4};
				curMax=Math.max(curMax, curSum);
			}
			res=Math.max(curMax, res);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,-2,3,4};
		System.out.println(maxSum(arr));

	}

}

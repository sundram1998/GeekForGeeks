package c_arraysGFG;
//https://practice.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
public class MinimumNumberOfJumps {
	
	static int minJumps(int[] arr) {
		int n=arr.length;
		int maxR=arr[0];
		int step=arr[0];
		int jumps=1;
		if(n==1) return 0;
		else if(arr[0]==0) return -1;
		for(int i=1;i<n;i++) {
			maxR=Math.max(maxR, i+arr[i]);
			if(step==i) {
				jumps++;
				if(maxR<=i) {
					return -1;
				}
				step=maxR;
			}
		}
		if(step<n-1) return -1;
		return jumps;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 3, 5, 8, 0, 2, 6, 7, 6, 8, 9} ;
		System.out.println(minJumps(arr));

	}

}

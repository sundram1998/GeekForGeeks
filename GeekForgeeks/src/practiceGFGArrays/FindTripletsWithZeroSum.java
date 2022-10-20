package practiceGFGArrays;

import java.util.Arrays;

public class FindTripletsWithZeroSum {
	
	public  boolean findTriplets(int arr[]) {
		
		Arrays.sort(arr);	
		int n=arr.length;		
		for(int i=0;i<n-2;i++) {
			int high=n-1;
			int low=i+1;
			while(low<high) {
				int sum=arr[i]+arr[low]+arr[high];
				if(sum==0) return true;
				else if(sum<0) low++;
				else high--;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,0,-3,2,1};
		FindTripletsWithZeroSum obj=new FindTripletsWithZeroSum();
		System.out.println(obj.findTriplets(arr));

	}

}

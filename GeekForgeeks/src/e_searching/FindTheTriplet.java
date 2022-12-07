package e_searching;

public class FindTheTriplet {
	
	// Naive Solution
	static boolean isTriplet(int[] arr,int x) {
		int n=arr.length;
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==x) return true;
				}
			}
		}
		return false;
	}
	
	//Efficient Solution || time complexity O(n)
	// Works only for sorted array
	static boolean isTripplet(int arr[],int x) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int low=i+1;
			int high=n-1;
			while(low<high) {
				if(arr[i]+arr[low]+arr[high]==x) return true;
				else if(arr[i]+arr[low]+arr[high]>x) high--;
				else {
					 low++;
				}
			}
		}
		return false;
	}
	// Find Pair
	static boolean isPair(int arr[],int is,int x) {
		int n=arr.length;
		int i=is;
		int j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==x) return true;
			else if(arr[i]+arr[j]<x) i++;
			else j--;
		}
		return false;
	}
	//Using Pair Method 
	static boolean isATriplet(int arr[],int x) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(isPair(arr, i+1, x-arr[i])) return true;		
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,6,15};
		int x=10;
		System.out.println(isTriplet(arr, x));
		System.out.println(isTripplet(arr, x));
		System.out.println(isATriplet(arr, x));

	}

}

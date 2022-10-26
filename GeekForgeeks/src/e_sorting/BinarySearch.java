package e_sorting;
public class BinarySearch {
	// recursive solution
	static int bSearchRecursive(int[] arr,int low,int high,int x) {
		if(low>high) return -1;
		int mid=(low+high)/2;
		if(arr[mid]==x) return mid;
		else if(arr[mid]>x) {
			return bSearchRecursive(arr, low, mid-1, x);
		}
		else {
			return bSearchRecursive(arr, mid+1, high, x);
		}
	}	
	// Efficient Approach
	static int binarySearch(int[] arr,int x) {
		int low=0 ,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]>x) high=mid-1;
			else if(arr[mid]<x) low=mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,25,30,40,50};
//		System.out.println(binarySearch(array,25));
		System.out.println(bSearchRecursive(array, 0, 6, 30));
	}

}

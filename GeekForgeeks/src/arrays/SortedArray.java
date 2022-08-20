package arrays;

public class SortedArray {
	static boolean isSorted(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					return false;
				}
			}
		}
		return true;
	}
	//Efficient Approach
	static boolean isArraySorted(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayS= {10,16,18,20,30};
		int[] arrayU= {10,16,18,20,30,1};
		System.out.println(isSorted(arrayS));
		System.out.println(isArraySorted(arrayU));

	}

}

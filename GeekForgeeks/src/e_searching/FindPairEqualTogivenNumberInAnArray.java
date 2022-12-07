package e_searching;

public class FindPairEqualTogivenNumberInAnArray {

	// Naive Solution ||complexity:O(n**2) || Ax Space O(1)
	static boolean getPair(int[] arr, int x) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == x) {
					return true;
				}
			}
		}
		return false;
	}
	// Two pointer Technique
	// time complexity:O(n)
	static boolean isPair(int arr[],int x) {
		int n=arr.length; 
		int i=0,j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==x) return true;
			else if(arr[i]+arr[j]>x) j=j-1;
			else i=i+1;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 8, 12, 13 };
		int x = 20;
		System.out.println(getPair(arr, x));
		System.out.println(isPair(arr, x));

	}

}

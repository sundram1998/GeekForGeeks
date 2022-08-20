package arrays;

public class ReverseAnArray {
	static void reverseArray(int[] arr) {
		int temp;
		int low=0;
		int high=arr.length-1;
		while(low<high) {
			temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
		}
		low++;
		high--;	
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayU= {10,16,18,20,30,1};
		reverseArray(arrayU); 
	}

}

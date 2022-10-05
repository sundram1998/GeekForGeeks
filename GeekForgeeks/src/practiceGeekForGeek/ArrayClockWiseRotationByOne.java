package practiceGeekForGeek;

public class ArrayClockWiseRotationByOne {
	
	static void rotate(int arr[]) {
		int n=arr.length;
		int temp=arr[n-1];
		for(int i=0;i<n-1;i++) {
			arr[n-i-1]=arr[n-i-2];
		}
		arr[0]=temp;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		rotate(arr);

	}

}

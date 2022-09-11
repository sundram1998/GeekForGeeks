package arrays;

public class LeftRotateArray {
	static void leftRotateOne(int[] arr) {
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
//		for(int i=0;i<n;i++) {
//			System.out.print(arr[i]+" ");
//		}
	}
	static void leftRoateArray(int[] arr,int d) {
		for(int i=0;i<d;i++) {
			leftRotateOne(arr);
		}
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {8, 5, 9, 20, 10 };
		//leftRoateArray(array,2);
		rotateArrayLeft(array, 2);

	}
	// Method 2
	public static void rotateArrayLeft(int[] arr,int d) {
		int n=arr.length;
		int[] temp=new int[d];
		for(int i=0;i<d;i++) {
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++) {
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++) {
			arr[n-d+i]=temp[i];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

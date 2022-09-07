package arrays;
public class LeftrotateAnArrayByOne {
	static void leftRotate(int[] arr) {
		int n=arr.length;
		int temp=arr[0];
		for(int i=0;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {30,5,20,40,50};
		leftRotate(array);

	}

}

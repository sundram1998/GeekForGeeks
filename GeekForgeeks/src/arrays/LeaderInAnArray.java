package arrays;

public class LeaderInAnArray {
	// Naive Method
	static void leader(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			boolean flag =true;
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.print(arr[i]+" ");
			}
		}
	}
// Efficient Method
	static void leaderInArray(int arr[]) {
		int n=arr.length;
		int[] temp=new int[n];
		temp[0]=arr[n-1];
		int temp_size=1;
		int curr_leader=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			if(curr_leader<arr[i]) {
				curr_leader=arr[i];
				temp[temp_size]=arr[i];
				temp_size++;
			}
		}
		for(int i=0;i<temp_size;i++) {
			System.out.print(" "+temp[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,3,4,7,5,2};
		//leader(array);
		leaderInArray(array);
	}
}

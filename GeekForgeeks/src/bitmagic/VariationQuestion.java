package bitmagic;

public class VariationQuestion {
	static int missingNumber(int arr[],int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			res=res^arr[i];
		}
		for(int i=1;i<=n+1;i++) {
			res=res^i;
			System.out.println(res);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,2};
		missingNumber(arr, 3);

	}

}

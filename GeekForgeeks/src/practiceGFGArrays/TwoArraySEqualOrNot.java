package practiceGFGArrays;
import java.util.Arrays;

public class TwoArraySEqualOrNot {
	
	public static boolean equalOrNot(int arr[],int arr1[]) {
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int n=arr.length;
		boolean flag=true;
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr1[i]) flag=false;
		}
		if(flag==true) return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,4,0};
		int arr1[] = {2,4,5,0,7};
		System.out.print(equalOrNot(arr, arr1));
	}

}

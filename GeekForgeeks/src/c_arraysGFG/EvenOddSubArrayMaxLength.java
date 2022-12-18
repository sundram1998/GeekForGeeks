package c_arraysGFG;

public class EvenOddSubArrayMaxLength {
	
	static int maxLengthOddEven(int[] arr) {
		int n=arr.length;
		int result =1;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if (arr[j]%2==0 && arr[j-1]%2!=0 || arr[j]%2!=0 && arr[j-1]%2==0) {
					count++;
				}else {
					break;
				}
			}
			result=Math.max(count, result);
		}
		return result;
	}
	
	// efficient maxlength
	
	static int maxlength(int[] arr) {
		int n=arr.length;
		int res=1;
		int count=1;
		for(int i=1;i<n;i++) {
			if (arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0) {
				count++;
				res=Math.max(count, res);
			}else {
				count=1;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,12,14,7,8};
		System.out.println(maxLengthOddEven(arr));
		System.out.println(maxlength(arr));

	}

}

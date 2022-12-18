package c_arraysGFG;

public class EvenOddSunArrayMaxLength {
	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,12,14,7,8};
		System.out.println(maxLengthOddEven(arr));

	}

}

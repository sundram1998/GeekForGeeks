package practiceGFGArrays;

public class ThirdLargest {
	
	static int thirdLargest(int[] arr) {
		int n=arr.length;
		int large=arr[0];
		int second=-1,third=-1;
		for(int i=1;i<n;i++) {
			if(arr[i]>large) {
				third=second;
				second=large;
				large=arr[i];
			}
			else if(arr[i]>second && arr[i]!=large) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third && arr[i]!=second) {
				third=arr[i];
			}
		}
		return third;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7,0,8,7,9,10,14,26,15,98,98,111,98,90};
		System.out.println(thirdLargest(arr));

	}

}

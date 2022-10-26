package b_bitmagic;

public class OnlyOddOccuringNumber {
	public static void main(String[] args) {
		int arr[]= {20,20,25,16};
		naiveSolution(arr);
//		int count=oddOccrance(arr);
//		System.out.println(count);
		
	}
	static int oddOccrance(int[] arr) {
		//x^0=x
		//x^x=0
		//x^y=y^x
		int n=arr.length;
		int res=0;
		for(int i=0;i<n;i++) {
			res=res^arr[i];
		}
		return res;
	}
	static void naiveSolution(int arr[]) {
		//int arr[]= {4,4,4,3,3,3,5,5,5,5,4};
		int n=arr.length;
		int i;
		for( i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count%2!=0)
				System.out.print(arr[i]);
			
		}
	}
	

}

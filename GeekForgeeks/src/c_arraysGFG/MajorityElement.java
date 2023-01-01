package c_arraysGFG;

public class MajorityElement {
	// Efficient
	static int findMajority(int[] arr) {
		int n=arr.length;
		int res=0,count=1;
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
			else {
				count--;
				if(count==0) {
					count=1;
					res=i;
				}
			}
		}
		int cur=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==arr[res]) {
				cur++;
			}
		}
		if(cur<=n/2) {
			res=-1;
		}
		return arr[res];
	}
	// Naive 
	static int findMajorityElement(int [] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j])
					count++;
			}
			if(count>n/2) return arr[i];
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,8,4,8,8};
		System.out.println(findMajority(arr));
		System.out.println(findMajorityElement(arr));
	}

}

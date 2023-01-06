package c_arraysGFG;

public class PrefixSum {
	
	static void getSum(int[]  arr,int start,int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int subArray[] = { 1, 4, 20, 3, 10, 5 };
		getSum(subArray, 3, 4);
	}

}

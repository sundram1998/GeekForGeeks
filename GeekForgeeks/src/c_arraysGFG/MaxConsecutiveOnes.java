package c_arraysGFG;

public class MaxConsecutiveOnes {
	
	static void maxConsecutiveOnes(int[] arr) {
		int n=arr.length;
		int count=1,preCount=0,i=1;
		while(i<n) {
			if(arr[i]==1 && arr[i-1]==1) {
				count++;
				i++;
			}
		}
		if(count>preCount) preCount=count;
		i++;
		count=1;
		System.out.println(preCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bArray[]= {0,1,1,0,1,0};
		maxConsecutiveOnes(bArray);

	}

}

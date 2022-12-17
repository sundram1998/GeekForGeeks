package c_arraysGFG;

public class MaxConsecutiveOnes {
	
	static int maxOne(int arr[]) {
		int n=arr.length;
		int res=0;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[j]==1) {
					count++;
				}else {
					break;
				}
			}
			res=Math.max(res, count);
		}
		return res;
	}
	
	static int maxConsecutiveOnes(int[] arr) {
		int n=arr.length;
		int res=0;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				count=0;
			}
			else {
				count++;
				res=Math.max(count, res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bArray[]= {0,1,1,0,1,1,1,0};
		System.out.println(maxConsecutiveOnes(bArray));
	}

}

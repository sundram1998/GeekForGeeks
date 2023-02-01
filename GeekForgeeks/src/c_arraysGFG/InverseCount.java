package c_arraysGFG;

public class InverseCount {
	
	static long inverse(long arr[]) {
		int n=arr.length;
		long count=0;
		 for(int i=0;i<n-2;i++){
	            int l=i+1;
	            int h=n-1;
	            while(l<h){
	                if(arr[i]>arr[l] ){
	                    count++;
	                }
	                if( arr[i]>arr[h]) {
	                	count++;
	                }
	                l++;
	                h--;
	            }
	        }
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] arr= {2 ,4 ,1, 3, 5};
		System.out.println(inverse(arr));

	}

}

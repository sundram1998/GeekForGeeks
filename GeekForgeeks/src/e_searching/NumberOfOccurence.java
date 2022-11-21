package e_searching;
public class NumberOfOccurence {
	static int countOccurence(int[] arr,int x) {
		int first=IndexOfFirstOccurrenceInSortedArray.firstOcc(arr, x);
		if(first==-1) return 0;
		else {
			return (IndexOfLastOccuranceInSortedArray.lastOccur(arr, x)-first+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,0,1,1,1,1,1,1,1,1};
		int x=1;
		System.out.println(countOccurence(arr, x));
	}
 
}

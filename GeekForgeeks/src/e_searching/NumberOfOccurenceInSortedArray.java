package e_searching;
public class NumberOfOccurenceInSortedArray {
	static int countOccurence(int[] arr,int x) {
		int first=IndexOfFirstOccurrenceInSortedArray.firstOcc(arr, x);
		if(first==-1) return 0;
		else {
			return (IndexOfLastOccuranceInSortedArray.lastOccur(arr, x)-first+1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,0,1,1,1,1,1,1,1,1,2,2,2,2,2};
		int x=2;
		System.out.println(countOccurence(arr, x));
	}
 
}

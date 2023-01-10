package c_arraysGFG;

import java.util.Arrays;
import java.util.PriorityQueue;

public class GetKthSmallestElement {
	
	public static int kthSmallest1(int[] arr,int k) 
    { 
        //Your code here
      Arrays.sort(arr);
      return arr[k-1];
    } 
	
	public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int n = r-l+1;
        for(int i=0; i<n; i++){
            minHeap.add(arr[i]);
        }
        while(k-->1){
            minHeap.poll();
        }
        return minHeap.peek();
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7, 10, 4, 3 ,20 ,15};
		System.out.println(kthSmallest1(arr, 3));

	}

}

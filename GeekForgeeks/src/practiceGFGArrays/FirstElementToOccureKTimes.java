package practiceGFGArrays;

import java.util.HashMap;

public class FirstElementToOccureKTimes {
	
	static int firstElementKTym(int[] arr,int k) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count =0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) count++;
			}
			if(count==k) return arr[i];
		}
		return -1;
	}
	
	 public static int firstElementKTime(int[] a, int k) { 
		 int n=a.length;
	      int[] freq = new int[100001];

	        for (int i : a) {
	            freq[i]++;
	            if (freq[i] == k) return i;
	        }
	        return -1;
	    } 

	 static int firstElement(int arr[], int n, int k) {
	        // unordered_map to count
	        // occurrences of each element
	 
	        HashMap<Integer, Integer> count_map = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            int a = 0;
	            if(count_map.get(arr[i])!=null){
	                a = count_map.get(arr[i]);
	            }
	             
	            count_map.put(arr[i], a+1);
	        }
	        //count_map[arr[i]]++;
	 
	        for (int i = 0; i < n; i++) // if count of element == k ,then
	        // it is the required first element
	        {
	            if (count_map.get(arr[i]) == k) {
	                return arr[i];
	            }
	        }
	 
	        // no element occurs k times
	        return -1;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 7, 4, 3, 4, 8, 7};
		System.out.println(firstElementKTime(A,2));
		System.out.println(firstElementKTym(A, 2));
		System.out.println(firstElement(A, 7, 2));

	}

}

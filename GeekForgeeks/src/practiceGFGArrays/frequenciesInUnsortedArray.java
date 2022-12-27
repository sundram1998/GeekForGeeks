package practiceGFGArrays;

public class frequenciesInUnsortedArray {
	
	static void frequenciesInUnSortedArray(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			int count=0;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			System.out.println("frequency of  "+arr[i]+" is "+count);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {40,50,50,50,90};
		frequenciesInUnSortedArray(arr);
	}

}

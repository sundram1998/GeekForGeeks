package microsoftWaliDidi;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[]= {12,10,8,25,18};
		for(int i=0;i<arr.length;i++) {
			int smallest=i;
			for(int j=i+1;j<arr.length;j++) {
				if (arr[smallest]>arr[j]) {
					smallest=j;
				}
				int temp=arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			}
		}
		Sorting.printArray(arr);
	}

}

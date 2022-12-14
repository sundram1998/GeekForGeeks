package c_arraysGFG;

public class MoveZeroToEnd {
	static void swap(int[] arr, int i, int j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
	}
	
	static void moveZeRo(int arr[]) {
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				swap(arr, i, count);
				count++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	static void moveZero(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {                          // int[] array = { 8, 5, 0, 20,9 };
				for (int j = i + 1; j < n; j++) {
					if (arr[j] != 0) {
						System.out.println(i+" "+j);
						swap(arr, i, j);
						break;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 8, 5, 0, 20, 9 };
		// moveZero(array);
		moveZeRo(array);

	}

}

package arrays;

public class SecondLargest {
	static int getSecond(int[] arr) {
		int n=arr.length;
		int secLargest=-1;
		int largest=arrays.LargestElement.getLargest(arr);
		System.out.println(arr[largest]);
		for(int i=0;i<n;i++) {
			if(arr[i]!=arr[largest]) {
				if(secLargest==-1)
					secLargest=i;
				else if(arr[i]>secLargest) {
					secLargest=i;
				}
			}
		}
		return secLargest;
	}
	//Efficient Approach
	static int getSecondlargest(int[] arr) {
		int n = arr.length;
		int largest = 0;
		int secLargest = -1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[largest]) {
				secLargest = largest;
				largest = i;			
			} else if (arr[i] != arr[largest]) {
				if (secLargest == -1 || arr[i] > arr[secLargest]) {
					secLargest = i;
				}

			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {20,2,40,60};
		System.out.println(getSecond(array));
		System.out.println(getSecondlargest(array));

	}

}

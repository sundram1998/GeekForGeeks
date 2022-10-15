package arrays;

public class SecondLargest {
	static int getSecond(int[] arr) {
		int n = arr.length;
		int secLargest = -1;
		int largest = arrays.LargestElement.getLargest(arr);
		System.out.println(arr[largest]);
		for (int i = 0; i < n; i++) {
			if (arr[i] != arr[largest]) {
				if (secLargest == -1)
					secLargest = i;
				else if (arr[i] > secLargest) {
					secLargest = i;
				}
			}
		}
		return secLargest;
	}

	// Efficient Approach
	static int getSecondlargest(int[] arr) {
		int n = arr.length;
		int largest = arr[0];
		int secLargest = -1;
		int third=-1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {//20
				third=secLargest;
				secLargest=largest;
				largest=arr[i];
			} else if(secLargest<arr[i] &&arr[i]!=largest) {
				third=secLargest;
				secLargest=arr[i];
			}
		}
		return third;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {35 ,1 ,10 ,34 ,1};
//		System.out.println(getSecond(array));
		System.out.println(getSecondlargest(array));

	}

}

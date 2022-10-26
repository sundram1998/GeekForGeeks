package c_arraysGFG;

public class SecondLargest {
	static int getSecond(int[] arr) {
		int n = arr.length;
		int secLargest = -1;
		int largest = c_arraysGFG.LargestElement.getLargest(arr);
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
		if (n < 2) {
            System.out.printf(" Invalid Input ");
            return (Integer) null;
        }
		for (int i = 1; i < n; i++) {
			if (arr[i] > largest) {//20
				secLargest=largest;
				largest=arr[i];
			} else if(secLargest<arr[i] &&arr[i]!=largest) {
				secLargest=arr[i];
			}
		}
		return secLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {884, 337 ,689, 587, 748 ,308 ,451, 785 ,682 ,600, 733, 537 ,403 ,188 ,162 ,562 ,274 ,513 ,383 ,617 ,662 ,508 ,111 ,57 ,160};
//		System.out.println(getSecond(array));
		System.out.println(getSecondlargest(array));
 
	}

}

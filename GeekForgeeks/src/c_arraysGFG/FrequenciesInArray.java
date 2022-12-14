package c_arraysGFG;

public class FrequenciesInArray {

	static void frequencies(int[] arr) {
		int n = arr.length;
		int i = 1;
		int freq = 1;
		while (i < n) {
			while (i < n && arr[i] == arr[i - 1]) {
				freq++;
				i++;
			}
			System.out.println(arr[i - 1] + " of frequency " + freq + " ");
			freq = 1;
			i++;
		}
		if (n == 1 || arr[n - 1] != arr[n - 2]) {
			System.out.print(arr[n - 1] + " of frequency " + 1);
		}
	}

	static void frequency(int[] arr) {
		int n = arr.length;
		int count = 1;
		int i=1;
		while(i<n) {
			if(arr[i]==arr[i-1]) {
				count++;
			}
		}
		System.out.println("frequency of  "+arr[i]+" is "+count);
		i++;
		count=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 10, 10, 20, 30 };
//		frequencies(arr);
		frequency(arr);

	}

}

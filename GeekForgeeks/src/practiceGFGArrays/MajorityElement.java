package practiceGFGArrays;

public class MajorityElement {
	static int majorityElement(int a[]) {
		// your code here
		int n = a.length / 2;

		int high = a.length - 1;
		for (int i = 0; i < n; i++) {
			int count = 0;
			while (i < high) {
				if (a[i] == a[high])
					count++;
			}
			high--;
			if (count > n)
				return a[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 2, 3, 3, 4 };
		System.out.println(majorityElement(arr));
	}

}

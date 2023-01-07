package practiceGFGArrays;

public class Sort012 {
	public static void sort012(int a[], int n) {
		// code here
		for (int i = 0; i < n; i++) {
			if (a[i] == 0 && i != n - 1) {
				int j = i + 1;
				while (a[j] != 0 && j != n - 1) {
					j++;
				}
				if (a[j] == 0) {
					int temp = a[i + 1];
					a[i + 1] = a[j];
					a[j] = temp;
				}
			} else if (a[i] == 1 && i != n - 1) {
				int j = i + 1;
				while (a[j] != 0 && j != n - 1) {
					j++;
				}
				if (a[j] == 1) {
					int temp = a[i + 1];
					a[i + 1] = a[j];
					a[j] = temp;
				}
			} else {
				if (a[i] == 2 && i != n - 1) {
					int j = i + 1;
					while (a[j] != 0 && j != n - 1) {
						j++;
					}
					if (a[j] == 2) {
						int temp = a[i + 1];
						a[i + 1] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 2, 0, 1, 2, 0 };
		sort012(a, 5);

	}

}

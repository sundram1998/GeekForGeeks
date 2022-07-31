package hackerRankCodingQuestions;

import java.util.Scanner;

public class JavaSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		scan.close();
		int numNegativeSubarrays = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum = sum + a[k];
				}
				if (sum < 0) {
					numNegativeSubarrays++;
				}
			}
		}
		System.out.println(numNegativeSubarrays);
	}

}

package a_maths;

public class AllFactors {
	// In Increasing order Solution
	static void allFactorOfNumbers(int n) {
		int i;
		for (i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.print( i+" ");
			}
		}
		for(i=3;i>=1;i--) {
			if(n%i==0) {
				System.out.print(n/i+" ");
			}
		}
	}

	// Naive Solution
	static void allFactorOfNumber(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allFactorOfNumber(24);
		System.out.println();
		allFactorOfNumbers(18);

	}

}

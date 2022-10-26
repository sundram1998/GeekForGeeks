package a_maths;

public class PrimeFactors {
	//Most Efficient Solution
		static void primeFactorEfficient(int n) {
			if(n<=1) return;
			while(n%2==0) {
				System.out.print(2);
				n=n/2;
			}
			while(n%3==0) {
				System.out.print(3);
				n=n/3;
			}
			for(int i=5;i*i<n;i=i+6) {
				while(n%i==0) {
					System.out.print(i);
					n=n/i;
				}
				while(n%(i+2)==0) {
					System.out.print(i);
					n=n/i;
				}
			}
			if (n > 3)
				System.out.print(n);
		}

//Efficient Solution
	static void primeFactor1(int n) {
		if(n<=1) return;
		for(int i=2;i*i<n;i++) {
			while(n%i==0) {
				System.out.println(i);
				n=n/i;
			}
		}
		if (n > 1)
			System.out.print(n);
	}

	// Naive Solution
	static void primeFactor(int n) {
		for (int i = 2; i < n; i++) {
			if (PrimeNumber.isPrime1(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.print(i + " ");
					x = x * i;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		primeFactor(32);
		primeFactorEfficient(12);
	}

}

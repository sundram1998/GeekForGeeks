package maths;

public class AllPrimeNumbersSmallerOrEqualToN {
	
//Naive Solution
	static void allPrime(int n) {
		for(int i=2;i<=n;i++) {
			if(PrimeNumber.isPrime1(i)) {
				System.out.print(i+" ");
			}
		}
	}
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		allPrime(30);
	}

}

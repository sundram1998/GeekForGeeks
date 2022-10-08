package maths;

public class PrimeNumber {
	//Sieve of Eratosthenes Solution
	static boolean isPrime1(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=5;i*i<=n;i=i+6) {
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}
	//Naive Solution
	static boolean isPrime(int n) {
		if(n==1)
			return false;
		if(n==2 || n==3)
			return true;
		if(n%2==0 || n%3==0)
			return false;
		for(int i=4;i<n;i++)
			if(n%i==0)
				return false;
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		boolean isPrime=isPrime(4);
//		System.out.println(isPrime);
		boolean rime=isPrime1(25);
		System.out.println(rime);
	}

}

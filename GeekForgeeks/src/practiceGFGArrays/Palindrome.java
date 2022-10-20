package practiceGFGArrays;

public class Palindrome {
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	static boolean isPal(int n) {
		int rev=0;
		int temp=n;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		return (rev==temp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(7));

	}

}

package d_recursion;

public class SumOfDigits {
	static void iterative(int n) {
		int sum=0;
		while(n>0) {
			sum=sum+n%10;
			n=n/10;
		}
		System.out.println(sum);
	}
	static int sumOfDigits(int n) {
		//or we can use
//		if(n==0) {
//			return 0;
//		}
		
		if(n<=9) {
			return n;
		}
		return sumOfDigits(n/10)+n%10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=sumOfDigits(121356);
		System.out.println(sum);
		iterative(121356);

	}

}

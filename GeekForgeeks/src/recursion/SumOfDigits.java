package recursion;

public class SumOfDigits {
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

	}

}

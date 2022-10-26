package a_maths;

public class NumberOfDigitsInAFactorial {
	static double digits(int n) {
		double res=0;
		for(int i=1;i<=n;i++) {
			res=res+Math.log10(i);
			System.out.println(res+Math.log10(i));
		}
		return Math.floor(res)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res=digits(5);
		System.out.println("Number of digits:  "+res);
	}

}

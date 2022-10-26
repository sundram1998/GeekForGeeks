package a_maths;

public class FactorialOfN {
	static void fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}
	static int recusion(int n) {
		if(n==0) 
			return 1;
		return n*recusion(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fact(5);
		int fact=recusion(5);
		System.out.println(fact);

	}

}

package recursion;

public class FactorialOFNumbers {
	static int fact(int n) {
		if(n==0||n==1)
			return 1;
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		int fact=fact(5);
		System.out.println(fact);
	}

}

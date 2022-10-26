package a_maths;

public class Factorial {
	public static int recersive(int n) {
		if(n==0)
			return 1;
		return n*recersive(n-1);
		
	}
	public static void main(String[] args) {
		
		int fact=recersive(5);
		System.out.println(fact);
	}
}

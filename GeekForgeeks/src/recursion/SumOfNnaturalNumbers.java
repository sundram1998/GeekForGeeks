package recursion;

public class SumOfNnaturalNumbers {
	static int fun(int n) {
		if(n==0)
			return 0;
		return n+fun(n-1);
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=fun(10);
		System.out.println(sum);

	}

}

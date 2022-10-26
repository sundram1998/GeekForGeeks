package d_recursion;

public class Print_1_to_N {
	static void recursive(int n) {
		if(n==0)
			return;
		recursive(n-1);
		System.out.print(" "+n);
	}
	static void tailRecursive(int n,int k) {
		if(n==0)
			return;
		System.out.print(" "+k);
		tailRecursive(n-1, k+1); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//recursive(10);
		tailRecursive(10, 1);

	}

}

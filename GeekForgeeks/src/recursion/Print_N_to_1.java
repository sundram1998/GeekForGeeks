package recursion;

public class Print_N_to_1 {
	static int recursive(int n) {
		if(n==0)
			return 1;
		System.out.print(n+" ");
		return recursive(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive(10);
	}

}

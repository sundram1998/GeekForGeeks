package recursion;

public class DigitalRoot {
	static int digitalRoot(int n) {
		if(n<=9) {
			return n;
		}
		return digitalRoot(n/10+n%10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int root=digitalRoot(99999);
		System.out.println(root);

	}

}

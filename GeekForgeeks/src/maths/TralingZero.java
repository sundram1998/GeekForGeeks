package maths;

public class TralingZero {
	static int trailingZero(int n) {
		int res=0;
		for(int i=5;i<=n;i=i*5) {
			res=res+n/i;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res=trailingZero(25);
		System.out.println(res);
	}

}

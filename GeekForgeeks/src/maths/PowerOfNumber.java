package maths;

public class PowerOfNumber {
	static int power(int x,int n) {
		int res=1;
		for(int i=0;i<n;i++) {
			res=res*x;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

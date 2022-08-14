package bitmagic_problems;

public class FirstSetbitPosition {
	static int getFirstSetbit(int n) {
		int pos=1;
		while(n>0) {
			if((n&1)==1) {
				return pos;
			}
			pos++;
			n=n>>1;
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos=getFirstSetbit(18);
		System.out.println(pos);

	}

}

package b_bitmagic;
public class CountSetbit {
	public static void main(String[] args) {
		int count=countSetBrianKerningam(15 );
		System.out.println(count);
	}
	// Most efficient Method
	static int countSetBrianKerningam(int n) {
		if(n==0) return 0;
		int res=0;
		while(n>0) {
			n=n&(n-1);
			res++;			
		}
		return res;
	}
	static int countsetBitAnd(int n) {
		if(n==0) return 0;
		int res=0;
		while(n>0) {
			if((n&1)!=0) {
				res++;
			}
			n=n>>1;
		}
		return res;	
	}
	static int countSetBitModulus(int n) {
		if(n==0) return 0;
		int res=0;
		while(n>0) {
			if(n%2!=0) {
				res++;
			}
			n=n/2;
		}
		return res;	
	}


}

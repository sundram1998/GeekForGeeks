package practiceGeekForGeek;

public class PrimeFactor {
	static void primeFactor(int n) {
		if(n%2==0) System.out.print(2+" ");
		for(int i=3;i<=n/2;i=i+2) {
			if(n%i==0) System.out.print(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeFactor(12);

	}

}

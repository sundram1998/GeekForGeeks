package a_maths;

public class GreatestCommonDivisor {
	static int gcd_ab(int a,int b) {
		while(a!=b) {
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	//ecludian solution
	static int gcd_ecludian(int a,int b) {
		if(b==0) {
			return a;
		}else
		return gcd_ecludian(b, a%b);
	}
	//naive solution
	static int gcd(int num1,int num2) {
		int min=Math.min(num1, num2);
		while(min>0) {
			if(num1%min==0 && num2%min==0) {
				break;
			}
			min--;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gcd=gcd_ab(12, 18);
		System.out.println(gcd);

	}

}

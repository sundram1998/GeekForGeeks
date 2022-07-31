package bitmagic;

public class Operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leftShift(32, 1);
		//isPowerOftwo(4);
		//and(5,3 );
		
		
	}
	static void and(int a,int b) {	
//		System.out.println(a|b);
//		System.out.println(a&b);
		System.out.println(a^b);	
	}
	static void not(int a) {
		System.out.println(~a);
	}
	static void leftShift(int num,int pos) {
		int new_num=num<<pos;
		System.out.println(new_num);
	}
	static void rightShift(int num,int pos) {
		int new_num=num>>pos;
		System.out.println(new_num);
	}
	static void isPowerOftwo(int n) {
		if(n==0) 
			System.out.println("No");

		if((n&(n-1))==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}


}

package javaPackage;

public class GCD_ofTwoNumbers {
	public static void main(String[] args) {
		GCD_ofTwoNumbers obj=new GCD_ofTwoNumbers();
		int result =obj.gcd(100, 50);
		System.out.println(result);
	}
	public int gcd(int a,int b) {
		int rev=java.lang.Math.min(a, b);
		while(rev>0) {
			if(a%rev==0 & b%rev==0) {
				break;
			}
			rev--;
		}
		return rev;
	} 
	

}

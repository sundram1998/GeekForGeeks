package javaPackage;

public class Trailing_zero {
	public static void main(String[] args) {
		/*we are making an object instance of a class because we need it to call non
		static method in a static method*/
		
		Trailing_zero obj=new Trailing_zero();
		Double trailing_zeros=obj.trailing_Zero(20.0);
		System.out.println(trailing_zeros);
		
		Trailing_zero obj1=new Trailing_zero();
		int result=obj1.TrailingZero_eff(100);
		System.out.println(result);
	}
	//This method has overflow issue because for big numbers
	public Double trailing_Zero(Double n) {
		Double fact=1.0;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		Double rev=0.0;
		while(fact%10==0) {
			rev++;
			fact=fact/10;
		}
		return rev;
	}
	//this is efficient method
	//this method has time complexity of log(n)
	 public int TrailingZero_eff(int n) {
		 int rev=0;
		 for(int i=5;i<=n;i=i*5) {
			 rev=rev+n/i;
		 }
		 return rev;
	 }

}

package javaPackage;

public class Reverse_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev=0;
		int n=123456;
		while(n>0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
	}

}

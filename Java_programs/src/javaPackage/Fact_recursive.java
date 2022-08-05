package javaPackage;

//To find the factorial of a number
public class Fact_recursive {
	public static void main(String[] args) {
		//calling recursive method
		Fact_recursive objFact_recursive=new Fact_recursive();
		int result=objFact_recursive.fact_rec(5);
		System.out.println(result);
		
		//calling fact method
		Fact_recursive objFact_recursive2=new Fact_recursive();
		int result2=objFact_recursive2.fact(10);
		System.out.println(result2);
	}
	public Integer fact_rec(int n) {
		if(n==0) {
			return 1;
		}
		return n*fact_rec(n-1);
	}
	public Integer fact(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}

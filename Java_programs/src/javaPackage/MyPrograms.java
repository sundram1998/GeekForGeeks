package javaPackage;

//Finding the number of digits in a number.
public class MyPrograms {
	public static void main(String[] args) {
		FindNumber(677);
	}
	public static void FindNumber(int num) {
		int count=0;
		while(num!=0) {	
				while(num>0) {
					num=num/10;
					count++;
				}	
		}	
		System.out.println(count);
	}
}

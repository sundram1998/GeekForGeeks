package javaPackage; 

//To check if a number is palindrome number or not
public class Is_Palindrome {
	public static void main(String[] args) {
		float sum=0;
		int Initial_num=12321;
		int num=12321;
		while (num>0) {
			sum=sum*10+num%10;
			num=num/10;
		}
		if (sum==Initial_num) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}

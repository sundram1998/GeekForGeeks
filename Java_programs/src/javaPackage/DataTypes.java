package javaPackage;
import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number:");
		try (Scanner scanner = new Scanner(System.in)) {
			int num=scanner.nextInt();
			if (num<=127 && num>-128) {
				System.out.println("Number will be fitted in 'byte' data type");
			}
			else if (num<=32767 && num>-32768 ) {
				System.out.println("Number will be fitted in 'byte' and 'Short' data type");
			}else {
				System.out.println("Can't be fitted anywhere");
			}
		}
		

	}

}

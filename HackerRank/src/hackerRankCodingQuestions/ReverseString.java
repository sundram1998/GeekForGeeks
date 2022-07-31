package hackerRankCodingQuestions;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        sc.close();
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev=rev+string.charAt(i);
        }
        if(string.equals(rev)) {
        	System.out.println("Yes");
        }else {
			System.out.println("No");
		}
	}

}

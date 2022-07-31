//Input Format :-
//There are two lines of input. The first line contains B: the breadth of the parallelogram
//The next line contains H: the height of
//the parallelogram.
//Constraints :-
//-100 < B < 100
//-100 <H< 100
//Output Format :-
//If both values are greater than zero,
//then the main method must output the area of the parallelogram.
//Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
package hackerRankCodingQuestions;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int H=sc.nextInt();
			int B=sc.nextInt();
			if(H>0 && B>0) {
				System.out.println(H*B);
			}else {
				System.out.println("java.lang.Exception: Breadth and height must be positive");
			}
		}
		

	}

}

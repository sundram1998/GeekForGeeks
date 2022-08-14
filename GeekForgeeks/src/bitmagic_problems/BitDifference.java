package bitmagic_problems;

//You are given two numbers A and B. 
//The task is to count the number of bits needed to be flipped to convert A to B.
public class BitDifference {
	static int countBitsFlip(int a, int b) {

		int n = a ^ b;
		int res = 0;
		while (n > 0) {
			n = (n & (n - 1));
			res++;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flipBits=countBitsFlip(11, 12);
		System.out.println(flipBits);

	}

}

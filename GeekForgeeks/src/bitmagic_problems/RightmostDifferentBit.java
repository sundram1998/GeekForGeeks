package bitmagic_problems;
//Given two numbers M and N. 
//The task is to find the position of the rightmost different bit in the binary representation of numbers.
public class RightmostDifferentBit {
	static int rightmostDifferentBit(int n, int m) {
		int num = n ^ m;
		int pos = 1;
		while (num > 0) {
			if ((num & 1) == 1) {
				return pos;
			}
			pos++;
			num = num >> 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int position = rightmostDifferentBit(11, 9);
		System.out.println(position);

	}

}

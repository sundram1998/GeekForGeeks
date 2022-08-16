package bitmagic_problems;

/*Given a number N. 
 * Find the length of the longest consecutive 1s in its binary representation.*/
public class LongestConsecutive_1s {
	static int longestConsecutive1(int n) {
		int count = 0;
		while (n > 0) {
			n = (n & (n >> 1));
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestConsecutive1(3));

	}

}

package bitmagic_problems;

/*A number is said to be a sparse number if no two or more consecutive 
bits are set in the binary representation.*/
public class SparseOrNot {
	static boolean isSparse(int n) {
		if ((n & (n >> 1)) == 0)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean isSparse= isSparse(10);
		System.out.println(isSparse(10));

	}

}

package d_recursion;

public class MaximumPieces {
	static int maxPieces(int n, int a, int b, int c) {
		if (n == 0)
			return 0;
		if (n < 0)  
			return -1;
		int res = Math.max(maxPieces(n - a, a, b, c), maxPieces(n - b, a, b, c));
		int final_res = Math.max(res, maxPieces(n - c, a, b, c));
		if (final_res == -1)
			return -1;
		return final_res + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxPieces = maxPieces(23, 11, 9, 12);
		System.out.println(maxPieces);

	}

}

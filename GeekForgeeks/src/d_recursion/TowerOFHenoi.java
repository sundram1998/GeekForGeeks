package d_recursion;

public class TowerOFHenoi {
	static long towerOFHenoi(int n, int from, int to, int aux) {
		if (n == 1) {
			System.out.println("Move 1 from " + from + " to " + aux);
			return 1;
		}
		long moves=towerOFHenoi(n - 1, from, aux, to);
		System.out.println("Move " + n + " from " + from + " to " + aux);
		moves++;
		moves+=towerOFHenoi(n - 1, to, from, aux);
		return moves;
	}

	public static void main(String[] args) {
		long moves=towerOFHenoi(2, 1, 2, 3);
		System.out.println(moves);
		
	}

}

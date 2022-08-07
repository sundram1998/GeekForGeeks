package recursion;

public class TowerOFHenoi {
	static void towerOFHenoi(int n, int a, int b, int c) {
		if (n == 1) {
			System.out.println("Move 1 from " + a + " to " + c);
			return;
		}
		towerOFHenoi(n - 1, a, c, b);
		System.out.println("Move " + n + " from " + a + " to " + c);
		towerOFHenoi(n - 1, b, a, c);
	}

	public static void main(String[] args) {
		towerOFHenoi(3, 1, 2, 3);
	}

}

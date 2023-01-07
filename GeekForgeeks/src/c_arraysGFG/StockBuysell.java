package c_arraysGFG;

import java.util.ArrayList;

public class StockBuysell {

	static ArrayList<Integer> stockBuySell(int A[], int n) {
		// code here
		ArrayList<Integer> al = new ArrayList<Integer>();
		int profit = 0;
		int lastbuy = 0;
		for (int i = 1; i < n; i++) {
			if (A[i] <= A[lastbuy]) {
				profit += A[lastbuy];
				profit -= A[i];
				lastbuy = i;
			} else {
				al.add(lastbuy, i);
				lastbuy = i;
			}
		}
		profit += A[n - 1];
		return al;
	}

	// Efficient
	static int maxProfitStock(int price[]) {
		int n = price.length;
		int profit = 0;
		for (int i = 1; i < n; i++) {
			if (price[i] > price[i - 1]) {
				profit = profit + (price[i] - price[i - 1]);
			}
		}
		return profit;
	}

	// Naive Solution
	static int maxProfit(int price[], int start, int end) {
		if (end <= start)
			return 0;
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (price[j] > price[i]) {
					int cur_profit = price[j] - price[i] + maxProfit(price, start, i - 1)
							+ maxProfit(price, j + 1, end);
					profit = Math.max(profit, cur_profit);
				}
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[] = { 6, 5, 3, 8, 12, 4, 22, 24 };
		int profit = maxProfit(price, 0, 5);
//		System.out.println(profit);
//		System.out.println(maxProfitStock(price));
		System.out.println(stockBuySell(price, 8));
	}

}

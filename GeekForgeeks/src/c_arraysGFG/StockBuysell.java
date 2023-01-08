package c_arraysGFG;

import java.util.ArrayList;
import java.util.Arrays;

public class StockBuysell {
	// https://practice.geeksforgeeks.org/problems/stock-buy-and-sell-1587115621/1?page=1&category[]=Arrays&curated[]=1&sortBy=submissions
	 static ArrayList<ArrayList<Integer> > stockBuySell1(int A[], int n) {
	        // code here
	        // ArrayList<ArrayList<Integer> > al=new ArrayList<ArrayList<Integer> >();
	          ArrayList<ArrayList<Integer>> res = new ArrayList<>();

	        int i=0;

	        while(i<n) {

	            int l = i;

	            while(i<n-1 && A[i]<A[i+1]) {

	                i++;

	            }

	            if(i<n) {

	                int h = i;

	                if(l!=h) {

	                    ArrayList<Integer> a1 = new ArrayList<>();

	                    a1.add(l);

	                    a1.add(h);

	                    res.add(a1);

	                }

	            }

	            i=i+1;

	        }

	        return res;
	 

	    }

	static ArrayList<ArrayList<Integer> > stockBuySell(int arr[], int n) {
		// code here
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			try{
				if (arr[i] > arr[i - 1]){
              ans.add(new ArrayList<Integer>(Arrays.asList(i - 1, i)));
				}
			}
			catch (Exception e) {
			}
		}
		return ans;
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
		System.out.println(stockBuySell1(price, 8));
	}

}

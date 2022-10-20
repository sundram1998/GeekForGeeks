package arraysGFG;

public class StockBuysell {
	//Efficient
	static int maxProfitStock(int price[]) {
		int n=price.length;
		int profit=0;
		for(int i=1;i<n;i++) {
			if(price[i]>price[i-1]) {
				profit=profit+(price[i]-price[i-1]);
			}
		}
		return profit;
	}
	// Naive Solution
	static int maxProfit(int price[],int start,int end) {
		if(end<=start)
			return 0;
		int profit=0;
		for(int i=start;i<end;i++) {
			for(int j=i+1;j<end;j++) {
				if(price[j]>price[i]) {
					int cur_profit=price[j]-price[i]+maxProfit(price, start, i-1)+maxProfit(price, j+1, end);
					profit=Math.max(profit, cur_profit);
				}
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price[]= {1,5,3,8,12};
		int profit =maxProfit(price, 0, 5);
		System.out.println(profit);
		System.out.println(maxProfitStock(price));  
	}

}

package e_searching;

public class SquareRootOfNumber {
	//time complexity theta(x**1/2)
	static int sqrRoot(int x) {
		int i=1;
		while(i*i<=x) {
			i++;
		}
		return i-1;
	}
	
	// Efficient time complexity theta(log X)
	static int sqrOfNumber(int x) {
		int low=1,high=x,ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			int sqrmid=mid*mid;
			if(sqrmid==x) return mid;
			else if(sqrmid>x) high=mid-1;
			else {
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrRoot(25));
		System.out.println(sqrOfNumber(24));

	}

}

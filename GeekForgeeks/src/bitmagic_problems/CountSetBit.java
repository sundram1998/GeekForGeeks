package bitmagic_problems;

//You are given a number N. 
//Find the total count of set bits for all numbers from 1 to N(both inclusive).
public class CountSetBit {
	 static int countSetBits(int n)
	    {
	        int c = 0;
	        for (int p = 1; p <= n; p *= 2)
	        {
	            c += (((n + 1) / p) / 2) * p;
	            if (((n + 1) / p) % 2==1)
	            {
	                c += (n + 1) % p;
	            }
	        }
	        return c;
	    }
	public static void main(String[] args) {
		int totalBit=countSetBits(8);
		System.out.println(totalBit);
		
	}

}

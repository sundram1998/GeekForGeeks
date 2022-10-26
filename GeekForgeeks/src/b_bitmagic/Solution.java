package b_bitmagic;

public class Solution {
	public static int countSetBits(int n){  
        // Your code here
        int res=0;
        int count=0;
        for(int i=1;i<=n;i++){
            while(i>0){
                i=(i&(i-1));
                count++;
            }
            res=res+count;
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=countSetBits(4);
		System.out.println(count);

	}

}

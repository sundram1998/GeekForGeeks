package bitmagic_problems;

public class CheckkthBitIsSetOrNot {
	//we can use right shift also by shifting the number bit by k-1
	static void setBitOrNot(int n,int k) {
		if((n&(1<<(k-1)))==0) {
			System.out.println("No"); 
		}
		else {
			System.out.println("Yes");
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setBitOrNot(8, 3);
	}

}

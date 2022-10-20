package practiceGFGArrays;

public class Comptetion {
	
	static void  ab(long a[],long b[]) {
		int ca=0;
        int cb=0;
        // Your code goes here
        if(a[0]!=b[0]){
            if(a[0]>b[0]){
                ca++;
            }else{
                cb++;
            }
        }
        if(a[1]!=b[1]){
            if(a[1]>b[1]){
                ca++;
            }else{
                cb++;
            }
        }
        if(a[2]!=b[2]){
            if(a[2]>b[2]){
                ca++;
            }else{
                cb++;
            }
        }
        System.out.println(ca+" "+cb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] A = {4, 2, 7};
		long[] B = {5, 6, 3};
		ab(A, B); 

	}

}

package practiceGFGArrays;

public class ReplaceAllZerosWithFive {
	
    static int replaceZerosWithfive(int n) {
    	int conv=0;int i=1;
    	while(n!=0) {
    		int rem=n%10;
    		if(rem==0) rem=5;
    		conv=conv+rem*i;
    		n=n/10;
    		i=i*10;
    	}
    	return conv;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(replaceZerosWithfive(20009));

	}

}

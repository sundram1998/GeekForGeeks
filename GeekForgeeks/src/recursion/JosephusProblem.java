package recursion;

public class JosephusProblem {
	//gfg
	static int josephus(int n, int k)
	{
	   //Your code here
	   if(n==1){
	       return 1;
	   }
	   return ((josephus(n-1,k)+k-1)%n+1);
	}
	static int josProblem(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (josProblem(n-1, k)+k)%n;
	}
	//Suppose stating index starts with 1 not 0;
	static int extOfJos(int n,int k) {
		if(n==1) {
			return 0;
		}
		return (josProblem(n, k))+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int surviver=josProblem(3, 2);
		System.out.println(surviver);
		int ex=josephus(3, 2);
		System.out.println(ex);
	}

}

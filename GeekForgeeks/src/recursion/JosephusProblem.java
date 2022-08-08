package recursion;

public class JosephusProblem {
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
		int surviver=josProblem(7, 3);
		System.out.println(surviver);
		int ex=extOfJos(7, 3);
		System.out.println(ex);

	}

}

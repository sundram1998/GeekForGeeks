package maths;

public class LowestCommonMultiple {
	static int lcm_while(int a,int b) {
		int max=Math.max(a, b);
		while(true) {
			if(max%a==0 && max%b==0) {
				break;
			}
			max++;
		}
		return max;
	}
	//for loop
	static int lcm_ForLoop(int a,int b) {
		int min =Math.min(a, b);
		int max=Math.max(a, b);
		int res=1;
		for(int i=2;i<=max;i++) {
			res=min*i;
			if(res%max==0)
				break;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lcm=lcm_while(4, 8);
		System.out.println(lcm);

	}

}

package d_recursion;

public class GenerateSubsets {
	static void subsets(String s,String ch,int i) {
		if(i==s.length()) {
			System.out.print(ch+" ");
			return;
		}
		subsets(s, ch, i+1);
		subsets(s, ch+s.charAt(i), i+1);
	}
	public static void main(String[] args) {
		String chString=" ";
		String s="ABC";
		int i=0;
		subsets(s, chString, i);
		
	}
	
	
}

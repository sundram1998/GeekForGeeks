package d_recursion;

public class PalindromeString {
	static boolean isPal(String str,int start ,int end) {
		if(start>=end) {
			return true;
		}
		return (str.charAt(start)==str.charAt(end))&&isPal(str, start+1, end-1);
	}
	public static void main(String[] args) {
		boolean ans=isPal("ababa", 0, 4);
		System.out.println(ans);
		
	}

}

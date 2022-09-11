package recursion;

import java.util.Collections;

public class PrintingAllPermutationsOfString {
	static String allPermutations(String s,int i) {
		i=0;
		if(i==s.length()-1) {
			System.out.print(s+" ");
			return "";
		}
		for(int j=i;j<s.length();j++) {
			Collections.swap(null, s.charAt(i),s.charAt(j));
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

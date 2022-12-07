package e_searching;

public class RepeatingElement {
	
	static int repeating(int[] arr) {
		int n=arr.length-1;
		boolean[] visited=new boolean[n];
		for(int i=0;i<n-1;i++) {
			visited[i]=false;
		}
		for(int i=0;i<n;i++) {
			if(visited[arr[i]])
				return arr[i];
			visited[arr[i]]=true;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

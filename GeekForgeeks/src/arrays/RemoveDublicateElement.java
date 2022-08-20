package arrays;

public class RemoveDublicateElement {
	static int removeDublicateElement(int[] arr) {
		int n=arr.length;
		int[] temp=new int[n];
		temp[0]=arr[0];
		int res=1;
		for(int i=1;i<n;i++) {
			if(temp[res-1]!=arr[i]) {
				temp[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<res;i++) {
			System.out.print(temp[i]+" ");
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {10,20,20,30,30,40};
		System.out.println("and size is "+removeDublicateElement(array));

	}

}

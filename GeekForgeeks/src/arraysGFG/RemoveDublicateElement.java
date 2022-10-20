package arraysGFG;
//Sorted Array
public class RemoveDublicateElement {
	// complexity O(n) and space complexity O(1) 
	static int removeDublicates(int[] arr) {
		int n=arr.length;
		int res=1;
		for(int i=1;i<n;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res]=arr[i];
				res++;
			}
		}
		for(int i=0;i<res;i++) {
			System.out.print(arr[i]+" ");
		}
		return res;
	}
	// complexity O(n) and space complexity Theta(n)
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
		System.out.println(" length: "+removeDublicates(array));
		//System.out.println("and size is "+removeDublicateElement(array));

	}

}

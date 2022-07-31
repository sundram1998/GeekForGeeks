package geekforgeeks;

public class ArrayOperations {
	public static int delete(int value) {
		int [] arr= {1,23,3,12,4,54};
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				break;
			}
		}
		if(i==arr.length) {
			return arr.length;
		}
		for(int j=i;j<=arr.length-1;j++) {
			arr[j]=arr[j+1];
		}
		return arr.length-1;
		
	}
	public static int search(int value) {
		int [] arr= {1,23,3,12,4,54};
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==value) {
				return i;
			}
		}
		return -1;	
	}
	public static void main(String[] args) {
		int pos=search(0);
		System.out.println(pos);
	}

}

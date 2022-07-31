package geekforgeeks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayLists {
	public static int deleteArray(int x,int n) {
		int[] arr= {3,8,12,5,6};
		x=12;
		int i;
		for(i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				break;
			}
		}
		if(i==n) {
			return n;
		}
		for(int j=i;j<n-1;j++) {
			arr[j]=arr[j+1];
		}
		return (n-1);	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(40);
		arrayList.add(30);
		System.out.println(arrayList);
		int n=deleteArray(12, 5);
		System.out.println(n);
//		int[] arr= {10,7,6,9,8};
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]);
//			
//		}
		
	}

}

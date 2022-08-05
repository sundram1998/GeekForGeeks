package microsoftWaliDidi;

import java.util.Scanner;

public class Sorting {
	public static void insertionSort() {
		int arr[] = { 168, 97, 6, 5, 3, 2 };
		

	}

	public static void selectionSort() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=sc.nextInt();
		int arr[] = new int[len];
		for(int i=0;i<arr.length;i++) {	
			System.out.println("Enter the value for index "+i);
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			int smallest = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {
					int temp = arr[smallest];
					arr[smallest] = arr[j];
					arr[j] = temp;
				}
			}
		}
		printArray(arr);
	}

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void bubbleSort() {
		int arr[] = { 168, 97, 6, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArray(arr);
	}

	public static void main(String[] args) {
		//bubbleSort();
		selectionSort();
	}

}

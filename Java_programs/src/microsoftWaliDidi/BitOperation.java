package microsoftWaliDidi;

import java.util.Scanner;

public class BitOperation {
	public static int updateBit(int num,int pos) {
		int bitmask=1<<pos;
		Scanner scanner=new Scanner(System.in);
		int operation=scanner.nextInt();
		scanner.close();
		if (operation==1) {
			int updated=num|bitmask;
			System.out.println(updated);
			return updated;
		}else {
			int newmask=~(bitmask);
			int updated=newmask&num;
			System.out.println(updated);
			return updated;
		}
	}
	public static boolean getBit(int num,int pos) {
		//For get bit we perform AND(&) operation
		 num =5;
		 pos=2;
		 int mask=1<<pos;
		 if((mask & num )==0) {
			 System.out.println("0");
			 return false;
		 }else {
			 System.out.println("1");
			return true;
		}	
	}
	public static int setBit(int num,int pos) {
		//For setBit we perform OR(|) operation
		int bitMask=1<<pos;
		int newNum=num|bitMask;
		System.out.println(newNum);
		return newNum;
	}
	public static int clearBit(int num,int pos) {
		//1:First make bitmask
		//2:take the not of bitmask
		//3:perform and operation with bitmask and num
		int bitmask=1<<pos;
		int notBit=~(bitmask);
		int clearBit=notBit & num;
		System.out.println(clearBit);
		return clearBit;
		
	}
	public static void main(String[] args) {
		setBit(5, 1);
		getBit(5, 1);
		clearBit(5, 2);	
		updateBit(5, 2);
	}

}

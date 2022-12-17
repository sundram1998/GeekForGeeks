package c_arraysGFG;

public class Trappingwater {
	//Naive Solution
	static int trapWater(int[] arr) {
		int res=0;
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			int Lmax=arr[i];    //int arr[]= {5,0,6,2,3};
			for(int j=0;j<i;j++) {
				Lmax=Math.max(Lmax, arr[j]);
			}	
			int Rmax=arr[i];
			for(int j=i+1;j<n;j++) {
				Rmax=Math.max(Rmax, arr[j]);
			}
			
			res=res+Math.min(Lmax, Rmax)-arr[i];
			
		}
		return res;
	}
	
	// time complexity -: theta(n) && O(n) -: space comlexity
	static int trapingWater(int units[]) {
		int n=units.length;
		int trapedUnit=0;
		int lMax[]=new int[n],rMax[]=new int[n];
		lMax[0]=units[0];
		for(int i=1;i<n;i++) {
			lMax[i]=Math.max(units[i],lMax[i-1]);
		}
		rMax[n-1]=units[n-1];
		for(int i=n-2;i>=0;i--) {
			rMax[i]=Math.max(units[i], rMax[i+1]);
		}
		
		for(int i=1;i<n-1;i++) {
			trapedUnit=trapedUnit+Math.min(lMax[i], rMax[i])-units[i];
		}
		return trapedUnit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,6,2,3};
		System.out.println("traped unit is : "+trapingWater(arr));
		System.out.println("traped unit is : "+trapWater(arr));
	}

}

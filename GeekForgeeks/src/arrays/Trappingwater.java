package arrays;

public class Trappingwater {
	static int traingWater(int units[]) {
		int n=units.length;
		int trapedUnit=0;
		int min=Math.min(units[0], units[n-1]);
		for(int i=1;i<n-1;i++) {
			trapedUnit=trapedUnit+(min-units[i]);
		}
		if(trapedUnit<=0) {
			return 0;
		}
		return trapedUnit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,0,6,2,3};
		System.out.println(traingWater(arr));
	}

}

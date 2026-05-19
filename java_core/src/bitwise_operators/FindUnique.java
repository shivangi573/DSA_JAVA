package bitwise_operators;

public class FindUnique {

	public static void main(String[] args) {
		int[] arr = {2,4,5,3,7,4,2,7,5};
		System.out.println("The unique number in the given array is: " + unique(arr));
		return;
	}

	static int unique(int[] arr) {
		int uni = 0;
		for(int i : arr) {
			uni ^= i;
		}
		return uni;
	}
}

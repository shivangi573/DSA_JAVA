package java_core;

public class LinearSearchInRange {

	static boolean search1(int[] arr, int a, int start , int end) {
		if(arr.length == 0) {
			return false;
		}
		for(int i = start ; i <= end ; i++) {
			int element = arr[i];
			if(element == a) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array = {32, 89, 278, 90, 84, 29, 10, -3, -21, 22};
		System.out.println(search1(array, 22, 1 , 7));

	}

}

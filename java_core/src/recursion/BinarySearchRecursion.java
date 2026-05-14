package recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] arr = {1,4,6,8,22,40,78,90};
		System.out.print(binarySearch(arr, 100, 0, arr.length-1));
	}
	static int binarySearch(int[] arr, int target, int s, int e) {
		if(s>e) {
			return -1;
		}
		
		int m = s + (e - s)/2;
		if(arr[m]==target) {
			return m;
		}
		if(arr[m] < target) {
			return binarySearch(arr, target, m + 1, e);
		}
		return binarySearch(arr, target, s, m-1);
	}

}

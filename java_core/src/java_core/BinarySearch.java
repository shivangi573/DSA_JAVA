package java_core;

public class BinarySearch {

	static int binarySearch(int[] arr, int a) {
		int start = 0;
		int end = arr.length -1;
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(a>arr[mid]) {
				start = mid+1;
			}
			else if(a<arr[mid]) {
				end = mid-1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {-19,-17,-9,0,3,7,16,28,36,44,52,65};
		System.out.println(binarySearch(array, -9));
		return;
	}

}

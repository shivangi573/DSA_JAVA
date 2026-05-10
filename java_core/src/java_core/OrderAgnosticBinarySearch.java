package java_core;

public class OrderAgnosticBinarySearch {

	static int orderAgnosticBS(int[] arr, int a) {
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAsc = arr[start] < arr[end];
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(a==arr[mid]) {
				return mid;
			}
			if(isAsc) {
				if(a>arr[mid]) {
					start = mid+1;
				}
				else if(a<arr[mid]) {
					end = mid-1;
				}
			}
			else {
				if(a<arr[mid]) {
					start = mid+1;
				}
				else if(a>arr[mid]) {
					end = mid-1;
				}
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
//		int[] array = {-19,-17,-9,0,3,7,16,28,36,44,52,65};
		int[] array = {65, 52, 44, 36, 28, 16, 7, 3, 0, -9, -17, -19};
		System.out.println(orderAgnosticBS(array, -9));
		return;

	}

}

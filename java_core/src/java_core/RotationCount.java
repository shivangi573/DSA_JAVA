package java_core;

public class RotationCount {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,0,1,2};
		System.out.println(countrotation(arr));
		return;
	}
	static int countrotation(int[] arr) {
		int pivot = pivot(arr);
		if(pivot == -1) {
			return 0;
		}
		return pivot + 1;
	}
	static int pivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			if(mid>start && arr[mid]<arr[mid-1]) {
				return mid - 1;
			}
			if(end>mid && arr[mid]>arr[mid-1]) {
				return mid;
			}
			if(arr[mid]<arr[start]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}

}

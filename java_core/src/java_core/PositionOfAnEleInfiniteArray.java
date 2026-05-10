package java_core;

public class PositionOfAnEleInfiniteArray {

	public static void main(String[] args) {
		int[] arr = {2,5,6,8,9,12,24,56,67,78};
		int target =9;
		System.out.println(ans(arr,target));

	}
	static int ans(int[] arr, int target) {
		int start = 0;
		int end = 1;
		while(target>arr[end]) {
			int newstart = end+1;
			end = end+(end- start+1)*2;
			start = newstart;
		}
		return binarySearch(arr,target, start, end);
	}
	static int binarySearch(int[] arr, int target, int start , int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
		}
		return -1;
	}
	

}

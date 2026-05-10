package java_core;

public class FoundInMountainArray {

	static int search(int[] arr, int target) {
		int peak = peakelementinamountainarray(arr);
		int firsttry = orderagnosticBS(arr, target, 0, peak);
		if(firsttry != -1) {
			return firsttry;
		}
		return orderagnosticBS(arr, target, peak+1, arr.length-1);
	}
	static int peakelementinamountainarray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start<end) {
			int mid = start+(end-start)/2;
			if(arr[mid]>arr[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}
		}
		return start;
	}
	static int orderagnosticBS(int[] arr, int target, int start , int end) {
		boolean isasc = arr[start]<arr[end];
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(isasc) {
				if(arr[mid]>target) {
					end = mid -1;
				}
				else {
					start=mid+1;
				}
			}
			else{
				if(arr[mid]<target) {
					end = mid -1;
				}
				else {
					start=mid+1;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,3,1};
		int target = 3;
		System.out.println(search(arr, target));
		return ;

	}

}

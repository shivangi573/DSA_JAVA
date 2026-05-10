package java_core;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {2,2,6,7,0,1,2};
		System.out.println(search(arr, 2));
		return ;
	}
	static int binarysearch(int[] arr, int target, int start, int end) {
		while(start<=end) {
			int mid = start + (end - start)/2;
			if(arr[mid]>target) {
				end = mid - 1;
			}
			else if(arr[mid]<target) {
				start = mid +1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	static int search(int[] arr, int target) {
		int pivot = findpivot(arr);
		if(pivot == -1) {
			return binarysearch(arr, target, 0, arr.length - 1);
		}
		if(arr[pivot]==target) {
			return pivot;
		}
		if(target >= arr[0] && target <= arr[pivot]) {
			return binarysearch(arr, target, 0, pivot - 1);
		}
		else {
			return binarysearch(arr, target, pivot + 1, arr.length-1);
		}
	}
	static int findpivot(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		while(start<=end) {
			int mid = start + (end-start)/2;
//			case 1:
			if(mid<end && arr[mid]>arr[mid+1]){
				return mid;
			}
//			case 2:
			if(mid > start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			if(arr[start]>arr[mid]) {
				end = mid -1;
			}
			else {
				start=mid+1;
			}
			
//			if the elements at start , middle and end are equal
//			skip the duplicates
			if(arr[start] == arr[mid] && arr[end] == arr[mid]) {
				if(arr[start]>arr[start+1]) {
					return start;
				}
				start++;
				if(arr[end]<arr[end-1]) {
					return end-1;
				}
				end--;
			}
				//left side is sorted so pivot should be in right
			 else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
					start=mid+1;
				}
				else {
					end=mid-1;
				}
			}
		return -1;
	}
	

}

package sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {8,3,4,12,5,6};
		System.out.println(Arrays.toString(mergesort(arr)));
	}
	static int[] mergesort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length/2;
		int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	static int[] merge(int[] first, int[] last) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] mix = new int[first.length+last.length];
		while(i<first.length && j<last.length) {
			if(first[i]<last[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=last[j];
				j++;
			}
			k++;
		}
		//it may be possible that one of the array is not complete.
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			k++;
		}
		while(j<last.length) {
			mix[k]=last[j];
			j++;
			k++;
		}
		
		return mix;
	}
}

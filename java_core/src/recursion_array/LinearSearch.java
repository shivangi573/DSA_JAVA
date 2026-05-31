package recursion_array;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {33,24,56,1,22,99,45,22,87,32,22};
		System.out.println("The element is at present at position: "+search(arr,0,100));
		searchAtAllIndices(arr,0,22);
		System.out.println("The element is at present at position: "+list);
	}
	static int search(int[] arr, int index, int target) {
		if(index>arr.length-1) {
			return -1;
		}
		if(arr[index] == target) {
			return index+1;
		}
		return search(arr,index+1,target);
	}
	static List<Integer> list = new ArrayList<>();
	static void searchAtAllIndices(int[] arr, int index, int target) {
		if(index>arr.length-1) {
			return ;
		}
		if(arr[index] == target) {
			list.add(index+1);
		}
		searchAtAllIndices(arr,index+1,target);
	}
}

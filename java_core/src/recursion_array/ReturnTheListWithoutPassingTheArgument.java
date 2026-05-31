package recursion_array;

import java.util.ArrayList;

public class ReturnTheListWithoutPassingTheArgument {
	public static void main(String[] args) {
		int[] arr = {33,24,56,1,22,99,45,22,87,32,22};
		System.out.println("The element is at present at position: "+searchAtAllIndices(arr,0,22));
	}
	static ArrayList<Integer> searchAtAllIndices(int[] arr, int index, int target) {
		ArrayList<Integer> list = new ArrayList<>();
		if(index>arr.length-1) {
			return list;
		}
		if(arr[index] == target) {
			list.add(index+1);
		}
		ArrayList<Integer> ansfrombelowcalls = searchAtAllIndices(arr,index+1,target);
		list.addAll(ansfrombelowcalls);
		return list;
	}
}

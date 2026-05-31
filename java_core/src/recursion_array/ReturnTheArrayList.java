package recursion_array;
import java.util.ArrayList;
import java.util.List;
public class ReturnTheArrayList {

	public static void main(String[] args) {
		int[] arr = {33,24,56,1,22,99,45,22,87,32,22};
		ArrayList<Integer> ans = new ArrayList<>();
		searchAtAllIndices(arr,0,22, ans);
		System.out.println("The element is at present at position: "+ans);
	}
	static ArrayList<Integer> searchAtAllIndices(int[] arr, int index, int target, ArrayList<Integer> list) {
		if(index>arr.length-1) {
			return list;
		}
		if(arr[index] == target) {
			list.add(index+1);
		}
		return searchAtAllIndices(arr,index+1,target,list);
	}
}


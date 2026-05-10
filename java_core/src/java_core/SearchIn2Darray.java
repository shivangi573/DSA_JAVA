package java_core;

import java.util.Arrays;

public class SearchIn2Darray {
	static int[] search(int[][] array, int a) {
		for(int row = 0 ; row < array.length ; row++) {
			for(int col = 0 ; col < array[row].length ; col++) {
				if(array[row][col] == a) {
					return new int[]{row, col};
				}
			}
		}
		return new int[] {-1, -1};
	}
	static int max(int[][] array) {
		int max = array[0][0]; 
			for(int[] ints : array) {
				for(int element : ints) {
					if(max < element) {
						max = element;
					}
				}
			}
			return max;
	}
	public static void main(String[] args) {
		int[][] arr = {
				{18, 99, 74, 21},
				{27, 93},
				{-12, 45, 92},
				{29}
		};
		int target = 45;
		int[] ans = search(arr, target);
		System.out.println(Arrays.toString(ans));
		System.out.println("The maximun number in the element is: "+max(arr));
	}

}

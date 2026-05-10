package java_core;

import java.util.Arrays;

public class RowColMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{10,20,30,40},
				{15,25,35,45},
				{17,28,37,50},
				{19,29,39,55}
		};
		System.out.println(Arrays.toString(rowcol(matrix,39)));
		return;
	}
	static int[] rowcol(int[][] matrix, int target) {
		int r = 0;
		int c = matrix.length - 1;
		while(r<matrix.length && c>=0) {
			if(matrix[r][c] == target) {
				return new int[]{r, c};
			}
			else if(matrix[r][c]>target) {
				c--;
			}
			else {
				r++;
			}
		}
		return new int[]{-1, -1};
	}

}

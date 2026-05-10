package java_core;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
		System.out.println(Arrays.toString(search(matrix, 9)));
		}

	static int[] binarySearch(int[][] matrix, int target, int cStart, int cEnd, int row) {
		while(cStart<=cEnd) {
			int mid = cStart + (cEnd - cStart)/2;
			if(matrix[row][mid]==target) {
				return new int[] {row, mid};
			}
			if(matrix[row][mid] < target) {
				cStart = mid+1;
			}
			else {
				cEnd = mid-1;
			}
		}
		return new int[] {-1,-1};
		}
	static int[] search(int[][] matrix, int target) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if(rows == 1) {
			return binarySearch(matrix, target, 0, cols-1, 0);
		}
		if(cols==0) {
			return new int[] {-1,-1};
		}
		int rStart = 0;
		int rEnd = rows - 1;
		int cMid = cols/2;
		
		while(rStart < rEnd - 1) {
			int mid = rStart + (rEnd - rStart)/2;
			
			if(matrix[mid][cMid] == target) {
				return new int[] {mid,cMid};
			}
			if(matrix[mid][cMid] < target) {
				rStart = mid;
			}
			else {
				rEnd = mid;
			}
		}
		//now we have 2 rows
		//check whether the target element is in the mid col
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart,cMid};
		}
		if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid};
		}
		//search in the 1st half
		if(matrix[rStart][cMid-1] >=target) {
			return binarySearch(matrix, target, 0, cMid-1, rStart);
		}
		//search in the 2nd half
		if(matrix[rStart][cMid+1]<=target && matrix[rStart][cols-1] >= target) {
			return binarySearch(matrix, target, cMid+1, cols-1, rStart);
		}
		//search in the 3rd half
		if(matrix[rStart+1][cMid-1]>=target) {
			return binarySearch(matrix, target, 0, cMid-1, rStart+1);
		}
		else {
			return binarySearch(matrix, target, cMid+1, cols-1, rStart+1);
		}
	}
}

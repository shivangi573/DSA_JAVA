package java_core;

import java.util.Arrays;

public class FindMinimum {

	static int min(int[] arr) {
		int element = arr[0];
		for(int i = 1 ; i < arr.length ; i++) {
			if(element > arr[i]) {
				element = arr[i];
			}
		}
		return element;
	}
	public static void main(String[] args) {
		int[] array = {94, 82, -4, 0, -11, 98, -10};
		System.out.println(Arrays.toString(array));
		System.out.println(min(array));
		}

	}



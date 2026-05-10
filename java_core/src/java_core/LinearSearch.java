package java_core;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch1(int[] arr, int a) {
		if(arr.length==0) {
			return -1;
		}
		for(int i = 0 ; i < arr.length; i++) {
			int element = arr[i];
			if(element == a) {
				return i;
			}
		}
		return -1;
	}
	public static int linearSearch2(int[] arr,int a) {
		if(arr.length==0) {
			return -1;
		}
		for(int element : arr) {;
			if(element == a) {
				return element;
			}
		}
		return -1;
	}
	public static boolean linearSearch3(int[] arr, int a) {
		if(arr.length == 0) {
			return false;
		}
		for(int element : arr) {
			if(element == a) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] array = {12,87,-3,99,28};
		System.out.println(Arrays.toString(array));
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element you want to search: ");
		int target = sc.nextInt();
		System.out.println("The number is present at index: "+linearSearch1(array, target));
		System.out.println("The number is:  "+linearSearch2(array, target));
		System.out.println("The number is present:  "+linearSearch3(array, target));
		return;
	}

}

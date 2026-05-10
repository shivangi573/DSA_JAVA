package java_core;

import java.util.Scanner;

public class QUES1 {
	static int count(int[] arr) {
		int count = 0;
		int num = 0;
		for(int i : arr) {
			if(count == 0) {
				num = i;
			}
			if(i == num) {
				count++;
			}
			else {
				count--;
			}
		}
		count = 0;
		for(int i : arr) {
			if(i == num) {
				count++;
			}
		}
		if(count> arr.length/2) {
			return num;
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < size ; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(count(arr));
	return ;
	}
}

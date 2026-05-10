package java_core;

import java.util.Arrays;
import java.util.Scanner;

public class CeilingOfAnElement {

	static int ceiling(int[] arry, int a) {
		int start = 0;
		int end=arry.length-1;

		while(start<=end) {
			int mid = start + (end-start)/2;
			if(a>arry[arry.length -1])
			{
				return -1;
			}
			if(arry[mid]>a) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return arry[start];
	}
	public static void main(String[] args) {
		int[] arr = new int[7];
		System.out.println("Enter the elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Enter the target element: ");
		int target = sc.nextInt();

		int ans=ceiling(arr,target);
		System.out.println("The cieling of the target is :"+ans);
	}

}

package java_core;

import java.util.Scanner;
import java.util.Arrays;

public class SplitArray {

	public static void main(String[] args) {
		int size;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size = sc.nextInt();
		int[] nums = new int[size];

		System.out.println("Enter the elements of the array: ");
		for(int i = 0 ; i < size ; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println("Your array is: "+ Arrays.toString(nums));
		System.out.println("Enter the number for split: ");
		int k = sc.nextInt();
		int ans = splitArray(nums, k);
		System.out.println("The largest sum among the two subarrays is only: " + ans);
	}
	static int splitArray(int[] nums , int k ) {
		int start = 0;
		int end = 0;
		for(int i = 0; i< nums.length;i++) {
			start = Math.max(start, nums[i]);
			end+=nums[i];
		}
		
		while(start<end) {
			int pieces = 1;
			int sum = 0;
			int mid = start + (end - start)/2;
			for(int num : nums) {
				if(sum+num>mid) {
					sum=num;
					pieces++;
				}
				else {
					sum+=num;
				}
			}
			if(pieces>k) {
				start = mid+1;
			}
			else {
				end = mid;
			}
		}
		return end;
	}

}

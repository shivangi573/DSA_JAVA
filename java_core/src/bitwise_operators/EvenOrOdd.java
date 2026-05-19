package bitwise_operators;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		System.out.println(isEven(n));
	}
	static boolean isEven(int n) {
		return (n&1)==0;
	}

}

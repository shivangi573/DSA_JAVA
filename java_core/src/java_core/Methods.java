package java_core;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		/* // isPrime
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean ans = isPrime(n);
		System.out.println(ans);
		*/
		//isArmstrong
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		boolean ans = isArmstrong(n);
//		System.out.println(ans);
		
		for(int i = 100 ; i <1000; i++) {
			if(isArmstrong(i)) {
			System.out.print(i + " ");}
		}
		
	}
	
	static boolean isArmstrong(int num) {
		int original = num;
		int sum=0;
		while(num>0) {
				int rem = num%10;
				num/=10;
			sum+=rem*rem*rem;
		}
		return sum==original;
	}
	static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		int c = 2;
		while(c*c <= num) {
			if(num % c == 0) {
				return false;
			}
			c++;
			
		}
		return c*c>num;
	}

}

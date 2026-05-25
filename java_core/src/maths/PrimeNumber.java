package maths;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 1;
		System.out.println(isprime(num));	
		}
	static boolean isprime(int n) {
		if(n<=1) {
			return false;
		}
		int c = 2;
		while(c*c<=n) {
			if(n%c==0) {
				return false;
			}
			c++;
		}
		return true;
	}
}

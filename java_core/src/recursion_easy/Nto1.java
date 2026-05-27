package recursion_easy;

public class Nto1 {

	public static void main(String[] args) {
		int n = 9;
		f(n);
	}
	static void f(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);	
		f(n-1);
		}
}

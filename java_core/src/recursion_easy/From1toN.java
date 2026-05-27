package recursion_easy;

public class From1toN {

	public static void main(String[] args) {
		int n = 9;
		f(n);
	}
	static void f(int n) {
		if(n==0) {
			return;
		}
		f(n-1);
		System.out.println(n);	
		}
}

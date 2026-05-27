package recursion_easy;

public class Sum {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(add(n));
	}
	static int add(int n) {
		if(n==0) {
			return 0;
		}
		return n + add(n-1);
	}
}

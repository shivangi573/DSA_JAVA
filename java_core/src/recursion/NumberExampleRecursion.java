package recursion;

public class NumberExampleRecursion {

	public static void main(String[] args) {
		print(1);
	}
	static void print(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		//this is tail recurion
		//this is the last function call
		print(n+1);
	}

}

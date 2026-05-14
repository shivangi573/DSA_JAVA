package recursion;

public class NumberExample {

	public static void main(String[] args) {
		print1(1);
	}

	static int print1(int n) {
		System.out.println(n);
		return print2(2);
	}
	static int print2(int n) {
		System.out.println(n);
		return print3(3);
	}
	static int print3(int n) {
		System.out.println(n);
		return print4(4);
	}
	static int print4(int n) {
		System.out.println(n);
		return print5(5);
	}
	static int print5(int n) {
		System.out.println(n);
		return 0;
	}
}

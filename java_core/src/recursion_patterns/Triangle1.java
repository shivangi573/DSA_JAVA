package recursion_patterns;

public class Triangle1 {

	public static void main(String[] args) {
		triangle(5);
		System.out.println("---------------------------------------");
		trianglez(5,0);
	}
	static void triangle(int n) {
		if(n<0) {
			return;
		}
		for(int i = 1; i <=n;i++) {
			System.out.print("*"+" ");
		}
		System.out.println();
		triangle(n-1);
	}

	//another way
	static void trianglez(int r, int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			System.out.print("*");
			trianglez(r,c+1);
		}
		else {
			System.out.println();
			trianglez(r-1,0);
		}
		
	}
}

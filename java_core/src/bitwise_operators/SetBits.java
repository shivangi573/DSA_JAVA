package bitwise_operators;

public class SetBits {

	public static void main(String[] args) {
		int n = 88;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(bits(n));
	}
	static int bits(int n) {
		int count = 0;
//		while(n>0) {
//			count++;
//			n= n&(n-1);
//		}
		while(n>0) {
			count++;
			n-=n&(-n);
		}
		
		return count;
	}

}

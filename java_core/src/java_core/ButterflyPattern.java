package java_core;

public class ButterflyPattern {

	public static void main(String[] args) {
		int n = 6;
		//uper wala part:
		for(int row = 1; row<=n;row++ ) {
			//left stars
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			//left space
			int lspace = n-row;
			for(int col=lspace;col>0;col--) {
				System.out.print(" ");
			}
			//butterfly body
			if(row==1 || row==2*n-1) {
				System.out.print(" "+"*"+" ");
			}
			else {
				System.out.print("*"+" "+"*");
			}
			//right space
			int rspace = n-row;
			for(int col=rspace;col>0;col--) {
				System.out.print(" ");
			}
			//right stars
			for(int col=1;col<=row;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//neeche wala part:
		for(int row = n+1; row<=2*n-1;row++ ) {
			//left stars
			for(int col=1;col<2*n-row+1;col++) {
				System.out.print("*");
			}
			//left space
			int lspace = row-n;
			for(int col=lspace;col>0;col--) {
				System.out.print(" ");
			}
			//butterfly body
			if(row==1 || row==2*n-1) {
				System.out.print(" "+"*"+" ");
			}
			else {
				System.out.print("*"+" "+"*");
			}
			//right space
			int rspace = row-n;
			for(int col=rspace;col>0;col--) {
				System.out.print(" ");
			}
			//right stars
			for(int col=1;col<2*n-row+1;col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

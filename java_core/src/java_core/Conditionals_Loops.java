package java_core;
import java.util.Scanner;
public class Conditionals_Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// LARGEST NUMBER
		/* 
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		} */

		//CASECHECK
		/*char c = sc.next().trim().charAt(0);
		if(c>='a' && c<='z') {
			System.out.println("It is a lower case letter");
		}
		else {
			System.out.println("It is an upper case letter");
		}*/
		
		//FIBONACCI_NUMBERS
		/* int n = sc.nextInt();
		 int a = 0;
		 int b = 1;
		 int count = 2;
		 while(count<=n) {
			 int temp = b;
			 b = a + b;
			 a = temp;
			 count++;
		 }
		 System.out.println(b); */
		
		//COUNTING_OCCURANCES
		/* System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Enter the digit: ");
		int d = sc.nextInt();
		int count = 0;
		while(n>0) {
			int rem = n % 10; //last digit
			if(rem==d) {
				count++;
			}
			n = n/10;
		}
		System.out.println(count); */
		
		//REVERSE
		/* int n = sc.nextInt();
		int ans = 0;
		while(n>0) {
			int last = n % 10;
			ans = ans*10 + last;
			n /= 10;
		}
		System.out.println(ans); */
		
		//CALCULATOR
		
		int ans = 0;
		while(true) {
			System.out.print("Enter the operator: ");
			char ch = sc.next().trim().charAt(0);
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
				System.out.print("Enter two numbers: ");
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				if(ch == '+') {
					ans = num1 + num2;
				}
				else if(ch == '-') {
					ans = num1 - num2;
				}
				else if(ch == '*') {
					ans = num1 * num2;
				}
				else if(ch == '/') {
					ans = num1 / num2;
				}
				else{
					ans = num1 % num2;
				}
				
			}
			else if (ch == 'x' || ch == 'X') {
				break;
			}
			else {
				System.out.println("INVALID OPERATOR!!");
			}
			System.out.println(ans);
		}
		
	}

}

package java_core;

public class Patterns {
//patterns
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Patterns");
		pattern1(n);
		System.out.println("--------------------------------------------------");
		pattern2(n);
		System.out.println("--------------------------------------------------");
		pattern3(n);
		System.out.println("--------------------------------------------------");
		pattern4(n);
		System.out.println("--------------------------------------------------");
		pattern5(n);
		System.out.println("--------------------------------------------------");
		pattern6(n);
		System.out.println("--------------------------------------------------");
		pattern7(n);
		System.out.println("--------------------------------------------------");
		pattern8(n);
		System.out.println("--------------------------------------------------");
		pattern9(n);
		System.out.println("--------------------------------------------------");
		pattern10(n);
		System.out.println("--------------------------------------------------");
		pattern11(n);
		System.out.println("--------------------------------------------------");
		pattern12(n);
		System.out.println("--------------------------------------------------");
		pattern13(n);
		System.out.println("--------------------------------------------------");
		pattern14(n);
		System.out.println("--------------------------------------------------");
		pattern15(n);
		System.out.println("--------------------------------------------------");
		pattern16(n);
	}
	static void pattern1(int n ) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0; col<n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern3(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col < n - row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void pattern4(int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <= row; col++) {
				System.out.print(col+ " ");
			}
			System.out.println();
		}
	}
	static void pattern5(int n) {
		for(int row = 0 ; row < 2*n ; row++) {
			int totalColsInRow = row>=n?2*n-row:row;
			for(int col = 0; col < totalColsInRow; col++) {
	            System.out.print("* ");
	        }
			System.out.println();
		}
	}
	static void pattern6(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <n-row-1; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col <= row; col++) {
	            System.out.print("*");
	        }
			System.out.println();
		}
	}
	static void pattern7(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <row; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col < n-row; col++) {
	            System.out.print("*");
	        }
			System.out.println();
		}
	}
	static void pattern8(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <n-row-1; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col < 2*row+1; col++) {
	            System.out.print("*");
	        }
			System.out.println();
		}
	}
	static void pattern9(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <row; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col<2*n-2*row-1; col++) {
	            System.out.print("*");
	        }
			System.out.println();
		}
	}
	static void pattern10(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <=n-row-1; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col<=row; col++) {
	            System.out.print("* ");
	        }
			System.out.println();
		}
	}
	static void pattern11(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <=row; col++) {
				System.out.print(" ");
				
			}
			for(int col = 0; col<n-row; col++) {
	            System.out.print("* ");
	        }
			System.out.println();
		}
	}
	static void pattern12(int n) {
		for(int row = 0 ; row < 2*n ; row++) {
			int totalcols = row<n?row:2*n-row-1;
			for(int col = 0 ; col <totalcols; col++) {
				System.out.print(" ");
				
			}
			int totalstr = row<n?n-row: row-n+1 ;
			for(int col = 0; col<totalstr; col++) {
	            System.out.print("* ");
	        }
			System.out.println();
		}
	}
	static void pattern13(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 1 ; col <n-row; col++) {
				System.out.print(" ");
				
			}
			if(row==0) {
				System.out.print("*");
			}
			else if(row==n-1) {
				for(int col = 0 ; col<2*n-1;col++) {
					System.out.print("*");
				}
			}
			else {
				int totalcl = 2*row-1;
				System.out.print("*");
				for(int col = 0; col < 2 * row - 1; col++) {
	                System.out.print(" ");
	            }
	            System.out.print("*");}
			System.out.println();
		}
	}
	static void pattern13_cleanerversion(int n) {

	    for (int row = 0; row < n; row++) {

	        // leading spaces
	        for (int col = 0; col < n - row - 1; col++) {
	            System.out.print(" ");
	        }

	        // total columns in current row
	        int totalCols = 2 * row + 1;

	        for (int col = 0; col < totalCols; col++) {

	            // print star at boundaries
	            if (col == 0 || col == totalCols - 1 || row == n - 1) {
	                System.out.print("*");
	            } else {
	                System.out.print(" ");
	            }
	        }

	        System.out.println();
	    }
	}
	static void pattern14(int n) {
		for(int row = 0 ; row < n ; row++) {
			for(int col = 0 ; col <row; col++) {
				System.out.print(" ");
				
			}
			if(row==0) {
				for(int col=0;col<2*n-1;col++) {
				System.out.print("*");
			}}
			else if(row==n-1) {
					System.out.print("*");
				
			}
			else {
				System.out.print("*");
				for(int col = 1; col < 2* (n - row -1); col++) {
	                System.out.print(" ");
	            }
	            System.out.print("*");}
			System.out.println();
		}
	}
	static void pattern15(int n) {
		
		for(int row = 1 ; row < 2*n ; row++) {
			int totalspacecols = Math.abs(n - row);
			for(int col = 0 ; col <totalspacecols; col++) {
				System.out.print(" ");
				
			}
			System.out.print("*");
			int innerspaces =
	                row <= n
	                ? 2 * row - 3
	                : 2 * (2 * n - row) - 3;
				if(innerspaces>=1) {
				for(int col = 1; col <=innerspaces ; col++) {
	                System.out.print(" ");
	            }
				System.out.print("*");}
	            System.out.println();}
			
	}
	static void pattern16(int n) {
		for(int row = 0; row<n;row++) {
			for(int col = 1; col<n-row;col++) {
				System.out.print(" ");
			}
			int num = 1;

	        // numbers
	        for (int col = 0; col <= row; col++) {
	            System.out.print(num+" ");
	            // Pascal triangle formula
	            num = num * (row - col) / (col + 1);
	        }

	        System.out.println();
		}
	}
}

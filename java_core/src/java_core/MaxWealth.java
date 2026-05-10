package java_core;
//1672. Richest Customer Wealth
public class MaxWealth {
	static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int sum = 0;
            for(int element : ints){
                sum += element;
            }
            if(max<sum){
                max = sum;
            }
        }
        return max;
    }
	public static void main(String[] args) {
		int[][]  a = {{1, 2 ,9},{7, 9},{2, 8, 7, 4}};
		System.out.println(maximumWealth(a));
	}

}

package java_core;

public class EvenDigit {
	static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(isEven(num)){
                count++;
            }
        }
        return count;
    }
    static boolean isEven(int num){
        int ans = numberofDigits(num);
        return ans%2==0;
    }
    static int numberofDigits(int a){
    	if(a<0) {
    		a = a * -1;
    	}
    	return (int)(Math.log10(a))+1;
    }
	public static void main(String[] args) {
		int[] arr = {231,8921, 80291, -89, 1, 0};
		System.out.println(findNumbers(arr));
	}

}

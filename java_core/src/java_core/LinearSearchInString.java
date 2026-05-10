package java_core;

public class LinearSearchInString {
	static boolean search1(String str, char ch) {
		if(str.length() == 0) {
			return false;
		}
		for(int i = 0 ; i < str.length() ; i++) {
			if(ch == str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	static boolean search2(String str, char ch) {
		if(str.length() == 0) {
			return false;
		}
		for(char element : str.toCharArray()) {
			if(element == ch) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String res = "Shivangi";
		System.out.println(search1(res, 'd'));
		System.out.println(search2(res, 'd'));

	}

}

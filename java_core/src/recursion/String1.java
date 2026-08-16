package recursion;

public class String1 {

	public static void main(String[] args) {
//		skip("","baccahda");
//		System.out.print(skipapple("bcgapplenjsjnjikapple"));
		System.out.println(skipappnotapple("bcgapplenjsjnjikapple"));
		System.out.println(skipappnotapple("bcgappnjsjnjikapple"));
	}
	static void skip(String p, String up) {
		if(up.isEmpty()) {
			System.out.print(p);
			return;
		}
		char ch = up.charAt(0);
		if(ch == 'a') {
			skip(p, up.substring(1));
		}
		else {
			skip(p + ch, up.substring(1));
		}
		return;
	}
	static String skipapple(String up) {
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("apple")) {
			return skipapple(up.substring(5));
		}
		else {
			return up.charAt(0) + skipapple(up.substring(1));
		}
	}
	static String skipappnotapple(String up) {
		if(up.isEmpty()) {
			return "";
		}
		if(up.startsWith("app") && !up.startsWith("apple")) {
			return skipappnotapple(up.substring(3));
		}
		else {
			return up.charAt(0) + skipappnotapple(up.substring(1));
		}
	}
}

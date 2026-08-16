package recursion;

import java.util.ArrayList;

public class SubSeq {

	public static void main(String[] args) {
//		subseq("","abc");
//		System.out.print(subseqret("","abc"));
//		subseqascii("","abc");
		System.out.print(subseqasciiret("","abc"));
	}
	static void subseq(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseq(ch+p, up.substring(1));
		subseq(p, up.substring(1));
	}
	static ArrayList<String> subseqret(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> left = subseqret(ch + p , up.substring(1));
		ArrayList<String> right = subseqret(p,up.substring(1));
		left.addAll(right);
		return left;
	}
	static void subseqascii(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		subseqascii(ch+p, up.substring(1));
		subseqascii(p, up.substring(1));
		subseqascii((ch+0)+p, up.substring(1));
	}
	static ArrayList<String> subseqasciiret(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<String>();
			list.add(p);
			return list;
		}
		char ch = up.charAt(0);
		ArrayList<String> first = subseqasciiret(ch + p , up.substring(1));
		ArrayList<String> second = subseqasciiret(p,up.substring(1));
		ArrayList<String> third = subseqasciiret((ch+0)+p,up.substring(1));

		first.addAll(second);
		first.addAll(third);
		return first;
	}
}

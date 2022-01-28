package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "stops";
		String text2 = "potss";
		char[] text1Array = new char[text1.length()];
		char[] text2Array = new char[text2.length()];
		if (text1.length() == text2.length()) {
			for (int i = 0; i < text1.length(); i++) {
				text1Array = text1.toCharArray();
				text2Array = text2.toCharArray();
			}
			Arrays.sort(text1Array);
			Arrays.sort(text2Array);
			boolean status = Arrays.equals(text1Array, text2Array);
			if (status == true) {
				System.out.println(text1 + " is a Anagram of " + text2);
			} else {
				System.out.println(text1 + " is not a Anagram of " + text2);
			}
		}
	}
}

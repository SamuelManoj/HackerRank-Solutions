package practice_Java.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Anagrams {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length()) {
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char Char = a.charAt(i);
			if (!map.containsKey(Char)) {
				map.put(Char, 1);
			} else {
				Integer Count = map.get(Char);
				map.put(Char, ++Count);
			}
		}

		for (int i = 0; i < b.length(); i++) {
			char Char_b = b.charAt(i);
			if (!map.containsKey(Char_b)) {
				return false;
			}
			Integer Count_b = map.get(Char_b);
			if (Count_b == 0) {
				return false;
			} else {
				map.put(Char_b, --Count_b);
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}

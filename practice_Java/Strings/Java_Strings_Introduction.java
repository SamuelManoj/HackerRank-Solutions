package practice_Java.Strings;

import java.util.Scanner;

public class Java_Strings_Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println((A + B).length());
		if (A.compareTo(B) > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1, A.length()) + " "
				+ B.substring(0, 1).toUpperCase() + B.substring(1, B.length()));
	}

}

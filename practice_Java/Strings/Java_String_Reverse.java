package practice_Java.Strings;

import java.util.Scanner;

public class Java_String_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.equals(new StringBuilder(A).reverse().toString()) ? "Yes" : "No");
	}

}

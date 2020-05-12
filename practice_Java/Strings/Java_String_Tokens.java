package practice_Java.Strings;

import java.util.Scanner;

public class Java_String_Tokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		String regex = "[ !,?.\\_'@]+";
		String[] values = s.split(regex);
		System.out.println(values.length);
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
		}
		scan.close();
	}
}

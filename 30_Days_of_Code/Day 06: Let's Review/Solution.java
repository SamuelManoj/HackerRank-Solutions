import java.io.*;
import java.util.*;

public class Solution {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int x = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < x; i++) {
			String s = scanner.nextLine();
			for (int j = 0; j < s.length(); j++) {
				System.out.printf("%s", s.charAt(j));
				j++;
			}
			System.out.printf(" ");
			for (int j = 1; j < s.length(); j++) {
				System.out.printf("%s", s.charAt(j));
				j++;
			}
			System.out.println();

		}
	}
}

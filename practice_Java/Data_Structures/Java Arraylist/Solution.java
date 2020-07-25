import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		ArrayList[] arr = new ArrayList[count];
		for (int i = 0; i < count; i++) {
			int x = scan.nextInt();
			// arr[i] = new ArrayList();
			for (int j = 0; j < x; j++) {
				arr[i].add(scan.nextInt());
			}
		}
		int value = scan.nextInt();
		for (int i = 0; i < value; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			try {
				System.out.println(arr[a].get(b));
			} catch (Exception e) {
				System.out.println("ERROR");
			}
		}

	}
}

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = scan.nextInt();
			if (isPrime(x[i])) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}

		scan.close();
	}

	public static boolean isPrime(int x) {
		if (x == 2) {
			return true;
		}
		if (x == 1 || x % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= x; i += 2) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}

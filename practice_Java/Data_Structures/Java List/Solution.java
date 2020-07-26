import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextInt());
		}
		int x = scan.nextInt();
		for (int j = 0; j < x; j++) {
			String action = scan.next();
			if (action.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index, value);
			} else if (action.equals("Delete")) {
				int index = scan.nextInt();
				list.remove(index);
			}
		}

		for (int k = 0; k < list.size(); k++) {
			System.out.printf("%d", list.get(k));
			System.out.print(" ");
		}
		scan.close();
	}
}

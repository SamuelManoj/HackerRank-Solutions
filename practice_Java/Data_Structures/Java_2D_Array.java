package practice_Java.Data_Structures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.graalvm.compiler.replacements.nodes.arithmetic.IntegerAddExactOverflowNode;

public class Java_2D_Array {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[6][6];
		int max_sum = Integer.MIN_VALUE, sum;
		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (i > 1 && j > 1) {
					sum = arr[i][j] + arr[i][j - 1] + arr[i][j - 2] + arr[i - 1][j - 1] + arr[i - 2][j]
							+ arr[i - 2][j - 1] + arr[i - 2][j - 2];
					if (sum > max_sum) {
						max_sum = sum;
					}
				}
			}
		}
		System.out.println(max_sum);
		scanner.close();
	}

}

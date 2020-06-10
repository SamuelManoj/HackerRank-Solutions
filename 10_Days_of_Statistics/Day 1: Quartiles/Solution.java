import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(median(arr, 0, N / 2 - 1));
		System.out.println(median(arr, 0, N - 1));
		if (N % 2 == 0) {
			System.out.println(median(arr, N / 2, N - 1));
		} else {
			System.out.println(median(arr, N / 2 + 1, N - 1));

		}
		scan.close();
	}

	private static int median(int[] arr, int start, int end) {
		int length = end - start + 1;
		int median = 0;

		if (length % 2 == 0) {
			median = (arr[start + length / 2 - 1] + arr[start + length / 2]) / 2;
		} else {
			median = arr[start + length / 2];
		}
		return median;
	}
}

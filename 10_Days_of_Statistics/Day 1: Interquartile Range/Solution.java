import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int fre[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		int count = 0;
		for (int i = 0; i < N; i++) {
			fre[i] = scan.nextInt();
			count = count + fre[i];
		}

		int[] data = new int[count];
		int dataindex = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < fre[i]; j++) {
				data[dataindex] = arr[i];
				dataindex++;
			}
		}

		Arrays.sort(data);

		double Q1 = median(data, 0, data.length / 2 - 1);
		double Q3 = median(data, (data.length + 1) / 2, data.length - 1);

		double inter = Q3 - Q1;
		System.out.println(inter);

		scan.close();
	}

	private static double median(int[] list, int start, int end) {
		int length = start + end;
		if ((end - start) % 2 == 0) {
			return list[length / 2];
		} else {
			int v1 = list[length / 2];
			int v2 = list[length / 2 + 1];
			return (v1 + v2) / 2.0;
		}
	}
}

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int Warr[] = new int[N];
		int sum = 0;
		double temp = 0, WMean;

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			Warr[i] = scan.nextInt();
			sum = sum + Warr[i];
		}

		for (int i = 0; i < N; i++) {
			temp = temp + (arr[i] * Warr[i]);
		}

		WMean = (double) temp / sum;

		System.out.printf("%.1f", WMean);
		scan.close();
	}
}

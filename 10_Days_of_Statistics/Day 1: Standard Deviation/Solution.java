import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		double mean = 0, temp = 0;
		double Strd;

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
			mean = mean + arr[i];
		}

		mean = mean / N;

		for (int i = 0; i < N; i++) {
			temp = temp + Math.pow(Math.abs(arr[i] - mean), 2);
		}

		Strd = Math.sqrt((double) (temp / N));

		System.out.printf("%.1f", Strd);

		scan.close();
	}
}

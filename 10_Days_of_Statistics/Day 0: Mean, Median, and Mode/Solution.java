import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int arr[] = new int[N];
		int sum = 0;
		int count = 0, maxValue = 0;
		double mean, medium, mode;

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < N; i++) {
			sum = sum + arr[i];
		}
		mean = (double) sum / N;

		Arrays.sort(arr);

		if (N % 2 == 0) {
			medium = (double) (arr[(N / 2) - 1] + arr[N / 2]) / 2;
		} else {
			medium = arr[N / 2];
		}

		for (int num : arr) {
			int temp = 0;
			for (int inner : arr) {
				if (num == inner) {
					temp++;
				}
			}
			if (temp > count) {
				count = temp;
				maxValue = num;
			}
		}
		mode = maxValue;
		System.out.println(mean);
		System.out.println(medium);
		System.out.println(mode);
		scan.close();
	}
}

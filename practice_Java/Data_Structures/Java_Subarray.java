package practice_Java.Data_Structures;

import java.io.*;
import java.util.*;

public class Java_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum = sum + arr[j];
				if (sum < 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}

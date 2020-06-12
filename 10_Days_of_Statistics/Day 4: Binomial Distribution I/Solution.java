import java.io.*;
import java.util.*;

public class Solution {

	public static final double BOY = 1.09;
	public static final double GIRL = 1;

	public static void main(String[] args) {
		double p = BOY / (GIRL + BOY);
		double q = 1 - p;
		double probability = 0.0;

		for (int i = 6; i >= 3; i--) {
			probability = probability + (combination(i) * Math.pow(p, i) * Math.pow(q, 6 - i));
		}
		System.out.printf("%.3f", probability);
	}

	static double combination(int r) {
		return (factorial(6) / (factorial(r) * factorial(6 - r)));
	}

	static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}

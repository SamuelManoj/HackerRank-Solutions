package practice_Java.Introduction;

import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();

		// Write your code here.
		double d = scan.nextDouble();
		scan.nextLine();
		String s = scan.nextLine();
		scan.close();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);

	}

}

import java.util.Scanner;

public class Data_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		Scanner scan = new Scanner(System.in);

		/* Declare second integer, double, and String variables. */
		int a = scan.nextInt();
		double b = scan.nextDouble();
		scan.nextLine();
		String c = scan.nextLine();
		/* Read and save an integer, double, and String to your variables. */
		// Note: If you have trouble reading the entire String, please go back and
		// review the Tutorial closely.

		/* Print the sum of both integer variables on a new line. */
		System.out.println(a + i);
		/* Print the sum of the double variables on a new line. */
		System.out.println(b + d);
		/*
		 * Concatenate and print the String variables on a new line; the 's' variable
		 * above should be printed first.
		 */
		System.out.println(s + c);
		scan.close();
	}

}

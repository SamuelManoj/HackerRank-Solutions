import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int returnDate = scan.nextInt();
		int returnMonth = scan.nextInt();
		int returnYear = scan.nextInt();
		int expectedDate = scan.nextInt();
		int expectedMonth = scan.nextInt();
		int expectedYear = scan.nextInt();
		long fine = 0;
		scan.close();

		LocalDate dateReturned = LocalDate.of(returnYear, returnMonth, returnDate);
		LocalDate dateExpected = LocalDate.of(expectedYear, expectedMonth, expectedDate);

		if (dateReturned.isAfter(dateExpected)) {
			if (dateReturned.getYear() == dateExpected.getYear()) {
				if (dateReturned.getMonth() == dateExpected.getMonth()) {
					long difference = ChronoUnit.DAYS.between(dateExpected, dateReturned);
					fine = difference * 15;
				} else {
					long difference = ChronoUnit.MONTHS.between(dateExpected, dateReturned);
					fine = difference * 500;
				}
			} else {
				fine = 10000;
			}
		}
		System.out.println(fine);

	}
}

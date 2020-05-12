package practice_Java.Introduction;

import java.util.Scanner;

public class Java_End_of_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			System.out.println(i + " " + scanner.nextLine());
			i++;
		}
		scanner.close();
	}

}

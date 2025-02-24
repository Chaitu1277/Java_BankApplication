package loops;

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter number");
		int xy = scr.nextInt();
		int i = 1;
		while (i <= xy) {
			System.out.println("*");
			i++;

		}
		scr.close();
	}

}

package com.udemy;

import java.util.Scanner;

public class InputTut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner takeinput = new Scanner(System.in);

		System.out.println("Please Enter a line: ");

		String line = takeinput.nextLine();

		System.out.println("You entered: " + line);

		int num = takeinput.nextInt();

		System.out.println("You entered: " + num);

	}

}

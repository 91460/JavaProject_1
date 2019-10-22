package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1 = input.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = input.nextInt();
		System.out.println("Enter 3rd number");
		int num3 = input.nextInt();
		if (num1 < num2 && num1 < num3) {
			System.out.println("Smallest number is " + num1);
		} else if (num2 < num1 && num2 < num3) {
			System.out.println("Smallest number is " + num2);
		} else {
			System.out.println("Smallest number is " + num3);
		}
    }
}
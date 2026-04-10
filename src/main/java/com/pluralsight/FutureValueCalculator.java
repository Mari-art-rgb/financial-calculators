package com.pluralsight;
import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--Welcome to the Future Value Calculator!--");
        System.out.println("--Let's figure out your future interest!--\n\n");

        System.out.print("Please enter inital deposit: ");
        double principal = scan.nextDouble();

        System.out.println("Please enter your interest rate: ");
        double interest = scan.nextDouble();

        interest /= 365;

        System.out.println("Please enter total number of years: ");
        int year = scan.nextInt();

        double futureValue = Math.pow(principal * (1 + interest), (365 * year));
        System.out.println(futureValue);


    }
}

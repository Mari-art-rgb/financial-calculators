package com.pluralsight;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--Welcome to the Mortgage Calculator!--");
        System.out.println("--Let's figure out your monthly payment and intrest!--\n\n");
        System.out.print("Please enter the principal: ");
        double principal = scan.nextDouble();

        System.out.print("Please enter the interest rate:  ");
        double interest = scan.nextDouble() / 100;

        System.out.print("Please enter the loan length: ");
        int loanLength = scan.nextInt();

        interest /= 12;

        double numberOfMonthlyPayments = 12 * loanLength;
       // M = P × (i * (1+i)^n / ( (1 + i)^1)
        double monthlyPayment = principal * (interest * Math.pow(1 + interest, numberOfMonthlyPayments)) / (Math.pow(1 + interest, numberOfMonthlyPayments) - 1 ); //monthly payment

        //Total interest = (Mxn)-P
        double totalInterest = (monthlyPayment * numberOfMonthlyPayments) - principal;

        System.out.printf("$%.2f/mo payment with a total interest of $%.2f", monthlyPayment, totalInterest);

        System.out.println(monthlyPayment);

    }
}

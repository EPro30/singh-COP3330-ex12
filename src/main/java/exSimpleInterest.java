/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Riya Singh
 */

import java.util.Scanner;
public class exSimpleInterest {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int prncple = sc.nextInt();
        System.out.println("Enter the rate of Interest: ");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of years: ");
        int time = sc.nextInt();

        double amount = prncple*(1 + ((rate/100)*time));
        System.out.println("After " + time + " years at " + rate + "% rate, the investment will be worth $" + (int)amount + ".");
    }
}

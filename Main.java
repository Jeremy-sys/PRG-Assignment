package com.AssignmentCustomer;


public class Main {

    public static void changeDistributer (String[] args)
int amount, oneHundredDollar, maxsize = 50, tenDollar, fiveDollar, oneDollar, tenCent, fiveCent;

            System.out.println("Enter the amount of money for change to be printed:" + args[0]);  //The calculation module should enter the amount of money to be given as change and it will be displayed as well

            //The following code does the calculations of the change and how it should be distributed in terms of the available Money Acceptable
            amount = Integer.parseInt(args[0]);
            if (maxsize >= 0) {
                oneHundredDollar = amount / 100;
                amount = amount % 100;
                tenDollar = amount / 10;
                amount = amount % 10;
                fiveDollar = amount / 5;
                amount = amount % 5;
                oneDollar = amount / 1;
                amount = amount % 1;
                tenCent = amount / 10;
                amount = amount % 10;
                fiveCent = amount / 5;
                amount = amount % 5;
                System.out.println("Thank you for your support!!");
                System.out.println("*************************************************\n");
                System.out.println("You INSERTED: " + args[0]);
                System.out.println("Your change is disbursed as follows:");
                System.out.println("N$100X" + oneHundredDollar + ", " + "N$10X" + tenDollar + ", " + "N$5X" + fiveDollar + ", " + "N$1X" + oneDollar + ", " + "10centsX" + tenCent + ", " + "5centsX" + fiveCent);
         }else if  ( maxsize <= 0 ) {
                    tenDollar = amount / 10;
                    amount = amount % 10;
                    fiveDollar = amount / 5;
                    amount = amount % 5;
                    oneDollar = amount / 1;
                    amount = amount % 1;
                    tenCent = amount / 10;
                    amount = amount % 10;
                    fiveCent = amount / 5;
                    amount = amount % 5;

                    // After calculation and change available is not available the change will be set for the next value available as change.
                    System.out.println("Thank you for your support!!");
                    System.out.println("*************************************************\n");
                    System.out.println("You INSERTED: " + args[0]);
                    System.out.println("Your change is disbursed as follows:");
                    System.out.println("N$100X" + 0 + ", " + "N$10X" + tenDollar + ", " + "N$5X" + fiveDollar + ", " + "N$1X" + oneDollar + ", " + "10centsX" + tenCent + ", " + "5centsX" + fiveCent);


                }
            }
        }
/**
 * I hereby acknowledge that the work handed in is my own original work. If I
 * have quoted from any other source this information has been correctly referenced.
 * I also declare that I have read the Namibia University of Science and Technology
 * Policies on Academic Honesty and Integrity as indicated in my course outline and
 * the NUST general information and regulations - Yearbook 2018
 *
 * @author <Jeremy T.J Haihambo> <221003401>
 */

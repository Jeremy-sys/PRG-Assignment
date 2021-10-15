package com.AssignmentCustomer;
public class Main {

    public static void main(String[] args) {
            int amount,oneHundredDollar, tenDollar, fiveDollar, oneDollar, tenCent, fiveCent;

       System.out.println("Enter a amount of money you inserted from 200 to .5c:" + args[0]);  //A customer should enter the amount of money they will be inserting in the machine and it will be displayed as well

        //The following code does the calculations of the change and how it should be distributed in terms of the available Money Acceptable

            amount = Integer.parseInt(args[0]);
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
        System.out.println("N$100X"+oneHundredDollar+", " +"N$10X"+tenDollar+", " +"N$5X"+fiveDollar+ ", " +"N$1"+oneDollar +", "+"10centsX"+tenCent+ ", "+ "10centsX"+fiveCent);



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

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Enter the principal: " );
        double principal = sc.nextDouble();

        System.out.println( "Enter the rate of interest: " );
        double interest = sc.nextDouble();

        System.out.println( "Enter the number of years: " );
        double years = sc.nextDouble();

        System.out.println( "What is the number of times the interest is compounded per year: " );
        double numOfTimes = sc.nextDouble();

        interest = interest / 100;
        double temp1 = (1 +(interest / numOfTimes));
        double temp2 = (numOfTimes * years);

        double A = principal * Math.pow(temp1,temp2);

        System.out.println( "$" + (int)principal + " invested at " + (interest * 100) + "% for " + (int)years + " compounded " + (int)numOfTimes +
                " times per year is $" + (Math.round(A*100.0)/100.0) + ".");
    }
}

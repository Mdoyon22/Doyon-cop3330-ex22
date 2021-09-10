/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        int num1 = 0, num2 = 0, num3 = 0;
        int largest = 0;

        System.out.print("Enter the first number: ");
        num1 = inp.nextInt();

        largest = num1;

        System.out.print("Enter the second number: ");
        num2 = inp.nextInt();

        System.out.print("Enter the third number: ");
        num3 = inp.nextInt();

        if (num2 > largest)
        {
            largest = num2;
        }

        if (num3 > largest)
        {
            largest = num3;
        }

        System.out.print("The largest number is " + largest + ".");


        }
    }





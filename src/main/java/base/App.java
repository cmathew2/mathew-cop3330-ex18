/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\n" + "Press F to convert from Celsius to Fahrenheit. ");

        String temp = in.nextLine();

        if (temp.startsWith("F")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String fahr = in.nextLine();
            double f = Double.parseDouble(fahr);
            double c = ((f- 32) * 5)/9;
            System.out.println("The temperature in Celsius is " + c + ".");
        }
        else if (temp.startsWith("C")){
            System.out.print("Please enter the temperature in Celsius: ");
            String cel = in.nextLine();
            double c = Double.parseDouble(cel);
            double f = (c*9/5) +32;
            System.out.println("The temperature in Fahrenheit is " + f + ".");
        }
    }
}

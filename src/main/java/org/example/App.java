package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Christina Persaud
 */

public class App 
{
    public static int calcGallonsSquare (int num1, int num2)
    {
        int res;
        res= num1 * num2;
        return (res + 350-1)/350;
    }
    public static double calcGallonsRound (double num1)
    {
        double area;
        area= (num1 * num1 * Math.PI);
        double a;
        a = area/350;
        return (Math.ceil(a));
    }
    public static int calcGallonsLShape (int num1, int num2, int num3, int num4)
    {
        int a1= num1 * num2;
        int a2 = num3 *num4;
        int area;
        area = a1 + a2;
        return (area + 350-1)/350;
    }
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.print("Is your ceiling round, square or L shaped? ");
        String ans = input.nextLine();

        //Square Ceiling
        if (ans.equals("square") || ans.equals("Square")) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("What is the length of the ceiling in feet? ");
            int length = scan1.nextInt();

            Scanner scan2 = new Scanner(System.in);
            System.out.print("What is the width of the ceiling in feet? ");
            int width = scan2.nextInt();

            int gallons;

            gallons= calcGallonsSquare(length, width);

            if (gallons<=1){
                System.out.print("You will need to purchase " + gallons + " gallon of paint to cover " + (length * width) + " square feet.");
            }
            else {
                System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + (length * width) + " square feet.");
            }
        }
        else if (ans.equals("round") || ans.equals("Round")) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("What is the radius of the ceiling in feet? ");
            double radius = scan1.nextInt();

            double gallons;

            gallons= calcGallonsRound(radius);
            if (gallons<=1){
                System.out.print("You will need to purchase " + gallons + " gallon of paint to cover " + (Math.pow(radius, 2) * Math.PI) + " square feet.");
            }
            else {
                System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + (Math.pow(radius, 2) * Math.PI) + " square feet.");
            }
        }
        else if (ans.equals("L shaped") || ans.equals("l shaped")) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("What is the base of the first rectangle in feet? ");
            int base1 = scan1.nextInt();

            Scanner scan2 = new Scanner(System.in);
            System.out.print("What is the height of the first rectangle in feet? ");
            int height1 = scan2.nextInt();

            Scanner scan3 = new Scanner(System.in);
            System.out.print("What is the base of the second rectangle in feet? ");
            int base2 = scan3.nextInt();

            Scanner scan4 = new Scanner(System.in);
            System.out.print("What is the height of the second rectangle in feet? ");
            int height2 = scan4.nextInt();

            int gallons;

            gallons= calcGallonsLShape(base1, height1, base2, height2);

            if (gallons<=1){
                System.out.print("You will need to purchase " + gallons + " gallon of paint to cover the area of " + (base1*height1+base2*height2) + " square feet.");
            }
            else {
                System.out.print("You will need to purchase " + gallons + " gallons of paint to cover the area of " + (base1*height1+base2*height2) + " square feet.");
            }
        }
    }
}

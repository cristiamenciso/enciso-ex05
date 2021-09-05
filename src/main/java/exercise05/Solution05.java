package exercise05;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cristiam Enciso
 *
 Exercise 5 - Simple Math
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the input and output statements separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.
Challenges
Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Don’t allow the user to enter a negative number.
Break the program into functions that do the computations.
Implement this program as a GUI program that automatically updates the values when any value changes.

 */

import java.util.Scanner;

public class Solution05 {
    // create a scanner object
    // prompt user for the first and second number inputs
    // store number in a string variable
    // convert strings into int values
    // make string for addition, subtraction, multiplication, and division
    // print results

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String num1 = sc.nextLine();
        System.out.print("What is the second number? ");
        String num2 = sc.nextLine();

        int inum1 = Integer.parseInt(num1);
        int inum2 = Integer.parseInt(num2);

        String add = inum1 + " + " + inum2 + " = " + (inum1 + inum2) + "\n";
        String sub = inum1 + " - " + inum2 + " = " + (inum1 - inum2) + "\n";
        String mult = inum1 + " * " + inum2 + " = " + (inum1 * inum2) + "\n";
        String div = inum1 + " / " + inum2 + " = " + (inum1 / inum2);

        System.out.println(add + sub + mult + div);

    }
}

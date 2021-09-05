/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Joao Pedro Oliveira
 */

package exercise05;

import java.util.Scanner;

public class solution05 {

    /*
        Print "What is the first number?"
        'num1' = number 1 input from user

        print "what is the second number"
        'num 2 = number 2 input from user

        convert String value of 'num1' to integer value
        convert String value of 'num2' to integer value

        Print 'num1' + 'num2'

        print 'num1' - 'num2'

        print 'num1' * 'num2'

        print 'num1' / 'num2'


     */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        String number1 = scanner.nextLine();

        System.out.println("What is the second number?");
        String number2 = scanner.nextLine();

        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        int sum = num1 + num2;
        int subtraction = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;

        System.out.printf("%d + %d = %d\n", num1, num2, sum);
        System.out.printf("%d - %d = %d\n", num1, num2, subtraction);
        System.out.printf("%d * %d = %d\n", num1, num2, multiply);
        System.out.printf("%d / %d = %d\n", num1, num2, divide);
    }
}
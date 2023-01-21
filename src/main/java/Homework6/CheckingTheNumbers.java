package Homework6;

import java.util.Scanner;

public class CheckingTheNumbers {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int a = in.nextInt();
        System.out.print("Input second number: ");
        int b = in.nextInt();
        System.out.print("Input third number: ");
        int c = in.nextInt();

        if (a == b && a == c)
        {
            System.out.println("All numbers are equal!");
        }
        else {
            if ((a >= 0) && (b >= 0) && (c >= 0)) {
                System.out.println("Entered numbers are all positive numbers.");
            }
            else if((a < 0) && (b < 0) && (c < 0)) {
                System.out.println("Entered numbers are all negative numbers.");
            }
            else {
                System.out.println("Entered numbers are mixed numbers.");
            }
        }
    }
}

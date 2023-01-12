package Homework4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n = scanner.nextInt();

        System.out.println("Numbers are : " );
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
    }
}


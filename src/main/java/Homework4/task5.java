package Homework4;

import java.util.Scanner;

public class task5
{public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value n : ");
    int n = scanner.nextInt();

    System.out.println("\nАre not divisible by 3 and 7: ");
    for (int i=1; i<n; i++) {
        if (i%3!=0 && i%7!=0)
            System.out.print(i +"\n");
    }
}
}


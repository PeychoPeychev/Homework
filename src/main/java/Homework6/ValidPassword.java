package Homework6;

import java.util.Scanner;

 public class ValidPassword {
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);
         System.out.println("1. A password must have at least eight characters.\n" +
                 "2. А password must contain a symbol, number and letter.\n" +
                 "Please input a password: ");
         String pass = input.nextLine();


         if (isValidPassword(pass.toCharArray())) {
             System.out.println("Password is valid: " + pass);
         }else{
             System.out.println("Not a valid password: " + pass);
         }
     }
     static boolean isValidPassword(char[] pass) {
         int letters = 0, digits = 0, specialChars = 0;
         if (pass.length < 8) {
             return false;
         }
         for (int i = 0; i < pass.length; i++) {
             char ch = pass[i];
             if (Character.isLetter(ch)) {
                 letters++;
             } else if (Character.isDigit(ch)) {
                 digits++;
             } else if (isSpecialChar(ch)) {
                 specialChars++;
             }
         }
         return !(letters < 2 || digits < 1 || specialChars < 1);
     }

     static boolean isSpecialChar(char c) {
         switch (c) {
             case '@':
             case '#':
             case '$':
             case '%':
             case '^':
             case '&':
             case '+':
             case '=':
                 return true;
             default:
                 return false;
         }
     }
 }








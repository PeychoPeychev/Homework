package Homework6;

public class CheckingTheNumbers {
    public static boolean checkEquals(int a, int b, int c){
        return a == b && a == c;
    }
    public static String positiveNumber(int a, int b, int c){
        if ((a >= 0) && (b >= 0) && (c >= 0)) {
            System.out.println("Entered numbers are all positive numbers.");
        }
        else if((a < 0) && (b < 0) && (c < 0)) {
            System.out.println("Entered numbers are all negative numbers.");
        }
        else {
            System.out.println("Entered numbers are mixed numbers.");
        }
        return "";
    }

    public static void main(String [] args){
        int a = 5;
        int b = 5;
        int c = 5;
        System.out.println("This numbers is equals: " + checkEquals(a, b, c));
        System.out.println(positiveNumber(a, b, c));
    }


}

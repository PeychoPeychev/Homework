package Homework8;

public class MaxNumber {
    public static void main(String[] args) {
        int x = 11;
        int y = 45;
        int z = 89;

        System.out.println("Maximum number of x, y and z is: " + Math.max(x,(Math.max(y,z))));
    }
}
package Homework6;

public class SumAverage {

    public static double getAvarage(double number1, double number2) {
        double sum, avarage;
        sum = number1 + number2;
        avarage = sum / 2;
        return avarage;
    }
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

public static void main(String [] args){
    double num1, num2;
    num1 = 20;
    num2 = 23;
    System.out.println("The average is: " + getAvarage(num1, num2));

    int sum = calculateSum( 1, 9);
    System.out.println("The sum is: "+ sum);

    getAvarage(calculateSum( 20, 23),calculateSum(20,23));
    System.out.println("The average is: " + getAvarage(calculateSum(20, 23),calculateSum(20,23)));
}

}

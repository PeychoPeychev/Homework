package Homework8;

public class Area {
    public static void main(String[] args) {

        double a, b, c, Perimeter, s, Area;
        a = 5;
        b = 2;
        c = 4;

        Perimeter = a + b + c;
        s = (a + b + c)/2;
        Area = Math.sqrt(s*(s - a)*(s - b)*(s - c));

        System.out.printf("The area of the triangle is %.02f", Area);
    }
}
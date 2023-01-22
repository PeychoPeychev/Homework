package Homework8;

import java.util.Random;

public class RandomArray {
    public static void main(String [] args){
        Random random = new Random();
        int [] array = new int [7];
        for (int i = 0; i < array.length; i++){
            array [i] = random.nextInt();
            System.out.println(array[i]);
        }
    }
}

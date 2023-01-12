package Homework4;

public class task1 {
    public static void main(String[] args){
    int [] numberArray = new int[20];
            for (int i = 0; i < numberArray.length; i++){
                numberArray[i] = i * 5;
            }

            for (int i = 0; i < numberArray.length; i++){
                System.out.printf("Index is: %d and value at that index is: %d\n", i, numberArray[i]);
    }
}
}
package Homework4;
    public class task2 {
        public static void main(String[] args) {
            double [] array = {2, 1, 7, 6, 4, 2, 9, 2, 1, 7, 6, 4, 2, 9, 2, 1, 7, 6, 4, 2};
            double total = 0;

            for(int i=0; i<array.length; i++){
                total = total + array[i];
            }
            double average = total / array.length;
            System.out.printf("The average is: %.2f", average);
        }
    }


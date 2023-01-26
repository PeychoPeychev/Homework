package Homework5;

public class Test {
    public static void main(String [] args){
        Dog dog1 = new Dog(2, "Ragnar", 22.10f, "Husky");
        Cat cat1 = new Cat(5, "Zina", 5.20f, "Maine Coon", "grey");

        dog1.printData();
        dog1.bark();
        cat1.printData();
        cat1.mau();
    }
}

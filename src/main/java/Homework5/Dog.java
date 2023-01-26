package Homework5;

public class Dog extends Animal {
    private String breed;

    public Dog (int age, String name, float weight, String breed){
        super(age, name, weight);
        setBreed(breed);
    }

    public Dog(Dog dog){
        super(dog.getAge(), dog.getName(), dog.getWeight());
        setBreed(dog.getBreed());
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.isEmpty() && !breed.isBlank()){
            this.breed = breed;
        }else {
            System.out.println("ERROR: Invalid input data for Breed.");
        }
    }
    public void bark(){
        System.out.println("Bau bau bau");
    }
    public void printData(){ System.out.printf("Age is: %d, name is: %s, weight is: %.3f, breed is: %s\n",
            super.getAge(), super.getName(), super.getWeight(), breed);

    }
    }





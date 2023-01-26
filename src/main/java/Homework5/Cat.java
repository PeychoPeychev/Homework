package Homework5;
    public class Cat extends Animal {
        private String color;
        private String breed;

        public Cat(int age, String name, float weight, String breed, String color){
            super(age, name, weight);
            setBreed(breed);
            setColor(color);
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            if (!color.isEmpty() && !color.isBlank()) {
                this.color = color;
            } else {
                System.out.println("ERROR: Invalid input data for Color.");
            }
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
        public void mau(){
            System.out.println("Mau mau");
        }
        public void printData(){
            System.out.printf("Age is: %d, name is: %s, weight is: %.3f, breed is: %s color is: %s, \n",
                    super.getAge(), super.getName(), super.getWeight(), breed, color);
        }
    }

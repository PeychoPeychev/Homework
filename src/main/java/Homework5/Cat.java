package Homework5;
    public class Cat extends Animal {
        public String getBreed() {
            return breed;
        }

        public void setBreed(String breed) {
            this.breed = breed;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        private String breed;
        private String color;
        private int weight;

    }

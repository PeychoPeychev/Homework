package Homework5;

public  class Animal extends Action {
    private int age;
    private String name;
    private float weight;

    public Animal (int age, String name, float weight){
        setAge(age);
        setName(name);
        setWeight(weight);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {if (age > 0){
        this.age = age;
    }else {
        System.out.println("ERROR: Invalid input data for Age.");
    }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty() && !name.isBlank()){
        this.name = name;
    }else {
        System.out.println("ERROR: Invalid input data for Name.");
    }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if(weight > 0){
        this.weight = weight;
    }else {
        System.out.println("ERROR: Invalid input data for Weight.");
    }
    }

    public void play(){
        System.out.println("Cat play with ball");
    }

    public void eat(String meat){
        System.out.printf("Dog eat : %s", meat);
    }


}

package Lesson6.online.Homework6;

public abstract class Animals {
    protected String name;
    protected String color;
    protected int age;
   


    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public abstract void run(int distance);


    public  abstract void swim(int distance);


}

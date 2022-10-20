package Lesson6.online.Homework6;

public class Cat extends Animals{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м");
        }
        else {
            System.out.println(name + " не добежал");
        }
    }

    @Override
    public void swim(int distance) {
       System.out.println(name + " не умеет плавать!!!!");


    }

}

package Lesson6.online.Homework6;

public class Dog extends Animals{

    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        if (distance <= 500) {
            System.out.println(name + " пробежал " + distance + " м");
        }
        else {
            System.out.println(name + " не добежал");
        }

    }

   @Override
    public void swim(int distance) {
           if (distance <= 10) {
               System.out.println(name + " проплыл " + distance + " м");
           }
           else {
               System.out.println(name + " не доплыл");
           }


    }

}

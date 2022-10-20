package Lesson6.online.Homework6;

public class HomeWorkApp6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "белый", 2);
        Dog dog = new Dog("Шарик", "черный", 3);

       Animals[] animals = {cat, dog};
       for (int i = 0; i <animals.length ; i++) {
          animals[i].run(150);
          animals[i].swim(50);
        }
//        cat.run(150);
//        cat.swim(50);
//
//        dog.run(150);
//        dog.swim(10);

    }


}

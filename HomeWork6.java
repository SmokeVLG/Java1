
/**
 * Java home work for Lesson 6
 * author Denisov Maxim
 * date 30/07/2018
 *
 * @link https://github.com/SmokeVLG/Java1/blob/master/HomeWork6.java
 */
public class HomeWork6 {

    //Action for animal

    interface IAction {
        void run(int length);
        void swim(int length);
        void jump(int height);
    }


    /*
    * Class for Animal
    * */
    abstract static class Animal implements IAction {
        String name;
        String color;
        int age;

        Animal(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + color + " " + age;
        }

    }

    /*
  * Class for Cat
  * */
    public static class Cat extends Animal {

        Cat(String name, String color, int age) {
            super(name, color, age);
        }


        @Override
        public void run(int length) {
            if (length > 200) {
                System.out.println("Cat can't run that much.");
            } else {
                System.out.println("result run: true.");
            }
        }

        @Override
        public void swim(int length) {
            System.out.println("Cat can't swim ");
        }

        @Override
        public void jump(int height) {
            if (height > 2) {
                System.out.println("Cat can't jump that much.");
            } else {
                System.out.println("result jump: true.");
            }
        }
    }

    /*
  * Class for Dog
  * */
    public static class Dog extends Animal {

        Dog(String name, String color, int age) {
            super(name, color, age);
        }


        @Override
        public void run(int length) {
            if (length > 500) {
                System.out.println("Dog can't run that much.");
            } else {
                System.out.println("result run: true.");
            }
        }

        @Override
        public void swim(int length) {
            if (length > 10) {
                System.out.println("Dog can't swim that much.");
            } else {
                System.out.println("result swim: true.");
            }
        }

        @Override
        public void jump(int height) {
            if (height > 0.5) {
                System.out.println("Dog can't jump that much.");
            } else {
                System.out.println("result jump: true.");
            }
        }
    }


    public static void main(String[] args) {
        //task 1
        Animal cat = new Cat("Barsik", "black", 2);
        System.out.println(cat.toString());
        Animal dog = new Dog("Sharik", "white", 3);
        System.out.println(dog.toString());
        //task 2,3
        //cat
        cat.jump(10);
        cat.run(20);
        cat.swim(30);
        //dog
        dog.jump(10);
        dog.run(20);
        dog.swim(30);
        //task 4
        cat.jump(40);
        cat.run(50);
        cat.swim(60);
        //dog
        dog.jump(40);
        dog.run(150);
        dog.swim(60);

    }
}

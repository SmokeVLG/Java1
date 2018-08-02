
/**
 * Java home work for Lesson 7
 * author Denisov Maxim
 * date 02/08/2018
 *
 * @link 
 */
public class HomeWork7 {

     static class Plate {

        private int food;

        Plate(int food) {
            this.food = food;
        }

        //task 1,2
        // Is the cat satiety ?
        boolean decreaseFood(int n) {
            if (food > n) {
                food = food - n;
                return true;
            }
            return false;
        }

        // increase food to plate
        void increaseFood(int n) {
            food += n;
        }

        void info() {
            System.out.println("plate: " + food);
        }

    }

     static class Cat {
        private String name;
        private int appetite;
        private boolean satiety;

        Cat(String name, int appetite) {
            this.name = name;
            this.appetite = appetite;
        }

        void eat(Plate p) {
            satiety = p.decreaseFood(appetite);
        }

        @Override
        public String toString() {
            return "name: " + name + " appetite: " + appetite + " satiety: " + satiety;
        }
    }

    public static void main(String[] args) {

        Cat[] cats = {new Cat("Barsik", 5), new Cat("Murzik", 10), new Cat("Plusishe", 15)};
        Plate plate = new Plate(20);
        plate.info();
        //feed the cat
        for (Cat currentCat : cats) {
            currentCat.eat(plate);
            System.out.println(currentCat.toString());
        }
        plate.info();
        //Add food to plate
        plate.increaseFood(30);
        //feed the cat
        for (Cat currentCat : cats) {
            currentCat.eat(plate);
            System.out.println(currentCat.toString());
        }
        plate.info();

    }
}

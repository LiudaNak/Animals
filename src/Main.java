public class Main {

    public static void main(String[] args){

Koala koala1 = new Koala("Koala1", 10);
Koala koala2 = new Koala("Koala1", 11);
Cat cat1 = new Cat("Murchyk", 5, "White");
Cat cat2 = new Cat("Murchyk", 5, "White");
Horse horse1 = new Horse("Rysak", 300, 1);

//Cat's method
cat1.makeVibration();

Comparison comparison = new Comparison();
comparison.compareAnimals(cat1, horse1);
comparison.compareAnimals(cat1, cat2);
comparison.compareAnimals(koala1, koala2);

    }
}

import java.util.StringJoiner;

public class Koala extends Animal{

    public Koala(String name, int weight) {
        super (name, weight);
        System.out.println("Koala is created");
    }

    @Override
    public void makeSound() {
        System.out.println("Koala saying \"I'm a Koala\"");
    }

    @Override
    public void eat() {
        System.out.println("Koala eats leaves");
    }

    @Override
    public void sleep() {
        System.out.println("Koala sleeps up to 22 hours a day");
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Koala.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .add("animal='" + animal + "'")
                .toString();
    }
}
